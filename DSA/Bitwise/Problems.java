package DSA.Bitwise;

public class Problems {
    public static void main(String[] args) {
        // ! question 1: check if odd or even
        int nums = 15;
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
