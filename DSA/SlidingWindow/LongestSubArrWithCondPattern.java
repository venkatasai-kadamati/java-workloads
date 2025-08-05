package DSA.SlidingWindow;

// Pattern 2: We end up having lots of options from brute, better, optimal
// question: Find the longest subarray and return the length of it, where the condition is satisfied like (sum <= value)
// Here the windowSize isn't given, rather during final output, we end up returning mostly either the windowSize or elements of that window.

import java.util.ArrayList;
import java.util.List;

public class LongestSubArrWithCondPattern {
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 7, 10};
        int value = 10;

        int bruteResult = BruteTemplate(arr, value);
        System.out.println("Brute Result: " + bruteResult);
    }

    // Since we need to find the subarray that has sum <= value, we first generate all subarrays and then start checking.
    public static int BruteTemplate(int[] arr, int value) {
        List<List<Integer>> subArrList = new ArrayList<>();

        int n = arr.length;
        int output = 0;

        for (int subArrStart = 0; subArrStart < n; subArrStart++) {
            for (int subArrEnd = subArrStart; subArrEnd < n; subArrEnd++) {
                List<Integer> currSubArrList = new ArrayList<>();
                currSubArrList.add(arr[subArrEnd]);
                subArrList.add(currSubArrList);
            }

            System.out.println("SubArray: " + subArrList);
        }

        return output;
    }
}
