package DSA.Topicwise.Bitwise;

public class Basics {
    public static void main(String[] args) {
        // ! bitwise AND &
        int andResult = 5 & 6;
        System.out.println("result of & operation is: " + andResult);

        // ! bitwise OR |
        int orResult = 5 | 6;
        System.out.println("result of | operation is: " + orResult);

        // ! bitwise XOR ^ - if different then 1 else 0
        int xorResult = 5 ^ 6;
        System.out.println("result of ^ operation is: " + xorResult);

        // ! bitwise complement ~
        // ? first does complement and checks the below
        // if msb is 1, then it's -ve no else +ve
        // step 1: invert again as original
        // step 2: then add 1 to find a result.
        // note: ~0 = -1 not 1, this is due to 2's complement
        int complementResult = ~60;
        System.out.println("result of ~ operation is: " + complementResult);

        // ! bitwise left shift
        // ? a << b = a * 2^b
        // ex: 5 << 2 = 20
        int leftShiftRes = 5<<2;
        System.out.println("result of left shift operation is: " + leftShiftRes);

        // ! bitwise right shift
        // ? a >> b = a/2^b
        // ex: 6 >> 1 = 3
        int rightShiftRes = 6 >> 1;
        System.out.println("result of right shift operation is: " + rightShiftRes);
    }
}
