package Core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

public class Practice {
    public static void main(String[] args) {
        // int[] nums = { 0, 1, 4, 0, 5, 2 };
        // int[] nums = { 0, 20, 0, -20, 0, 20 };
        int[] nums = {0, 0, 0, 1, 3, -2 };
        moveZeroes(nums);

        System.out.println(Arrays.toString((nums)));

    }

    public static void moveZeroes(int[] nums) {
        // idea: use left rotate array by one place concept when we hit a zero

        int end = nums.length;

        int processed = 0;
        for (int i = 0; i < end; i++) {

            if (nums[i] == 0 && nums[i] != (end - processed)) {
                // call rotate with start as i
                int start = i;
                System.out.println("i: " + i);
                leftRotateByOne(nums, start, end);
                processed++; // 0, end(6)
                // break;
                // System.out.println(Arrays.toString((nums)));
            }
        }
    }

    private static void leftRotateByOne(int[] nums, int start, int end) {
        // start to end
        int temp = nums[start]; // 0

        // 1 to 6
        for (int i = start + 1; i < end; i++) {
            // populate backwards: logic went wrong
            nums[i - 1] = nums[i];
        }

        nums[end - 1] = temp;
        // System.out.println(Arrays.toString(nums));
    }
}

// concerns: -> reduce calls
// 1. how to stop unwanted 0, 0 ending rotations?
// 2.
