package DSA.Bitwise;

public class Problems {
    public static void main(String[] args) {
        // ! question 1: check if odd or even
        int nums = 10;
        String output = isEvenOrOdd(nums);
        System.out.println("the digit is : " + output);

        // ! question 2: get,set,clear ith bit
        // ** get bit
        int ithVal = getBit(nums, 2);
        System.out.println("ith bit is: " + ithVal);

        // ** set bit
        int settedBit = setBit(nums, 2);
        System.out.println("new value after setting bit: " + settedBit);

        // ** clear bit
        int clearedNum = clearBit(nums, 1);
        System.out.println("cleared value after clearing bit: " + clearedNum);

        // ** update bit
        int updatedNum = updateBit(nums, 1, 1);
        System.out.println("updated value: " + updatedNum);

        // ** clear last i bits
        int clearedLastBits = clearLastBits(nums, 2);
        System.out.println("clear last bits: " + clearedLastBits);

        // ** clear range of bits
        // ! review this later - complex thought process, decide on how we compute bit mask
        int rangeBits = clearRangeOfBits(nums, 2 ,7);
        System.out.println("clear range of bits: " + rangeBits);

        // ** check if num is exponent of 2
        boolean isExponent = checkExponent(nums, 2);
        System.out.println("number is exponent of 2 : "+ isExponent);

        // ** count set bits in number
        int setBitsCnt = countSetBits(nums);
        System.out.println("number of set bits in number: " + setBitsCnt);
    }

    public static int countSetBits(int nums){
        // the idea is to check lsb for each iteration. after validating curr lsb, we need to do the right shift and repeat the same
        int setCount = 0;
        while(nums != 0) {
            int currBit = nums & 1; // get the least significant bit (lsb)
            if(currBit == 1){
                setCount++;
            }
            nums = nums >> 1;
        }
        return setCount;
        // The below is an alternative approach using loop instead-of-bits
        // String bitForm = Integer.toBinaryString(nums);
        // char[] bitFormArr = bitForm.toCharArray();
        // System.out.println(bitFormArr);
        // int setCount = 0;
        // for (char currBit: bitFormArr){
        //     System.out.println(currBit);
        //     if(currBit == '1'){
        //         setCount++;
        //     }
        // }
        // return setCount;
    }

    public static boolean checkExponent(int nums, int base){
        int pow = (int) (Math.log(nums)/Math.log(2));
        int bitMask = 1 << pow; // 0010 - mask
        // idea: if after doing "nums & bitmask", it is the same as original as its pow of 2.
        // a better one-liner is to use: n & (n-1) == 0, this eliminates the need to first find pow using log
        return (nums & bitMask) == nums;
    }

    public static int clearRangeOfBits(int nums, int i, int j){
        // step 1:
        int a = -1; // 1111111111
        // step 2:
        a = a << j + 1;
        // step 3:
        int b = (1 << i) - i;

        return nums & (a | b);
    }

    public static int clearLastBits(int nums, int i){
        int newVal = nums & (~0 << i);
        // or even we can use: nums & (-1 << i)

        return newVal;
    }

    public static int updateBit(int nums, int status, int i) {
        // if status = 0, then clear else it is set
        // clear means set to 0, wherein a set means 1.
        int newVal;
        if(status == 0){
            newVal = clearBit(nums, i);
        }else{
            newVal = setBit(nums,i);
        }
        return newVal;
    }

    public static int clearBit(int nums, int i){
        return nums & ~(1 << i);
    }

    public static int setBit(int nums, int i ){
        // the idea is to first create a bitmask using 1 and with left shift.
        return nums | (1 << i);
    }

    public static int getBit(int nums, int i){
        // step 1: right shift
        // step 2: then use & 1 and if a result == 1/0

        // ? we can also use left shift here: nums & (1 << i)
        int rightShift = nums >> i;

        int bitVal;
        if((rightShift & 1) == 1){
            bitVal = 1;
        }else{
            bitVal= 0;
        }
        return bitVal;
    }
    public static String isEvenOrOdd(int nums){
        int bitMask = 1;
        if((nums & bitMask) == 1){
            return "odd";
        }else{
            return "even";
        }
    }
}
