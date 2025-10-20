package DSA.Topicwise.SlidingWindow;

// Pattern 2: We end up having lots of options from brute, better, optimal
// question: Find the longest subarray and return the length of it, where the condition is satisfied like (sum <= value)
// Here the windowSize isn't given, rather during final output, we end up returning mostly either the windowSize or elements of that window.

public class LongestSubArrWithCondPattern {

    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 7, 10};
        int value = 10;

        int bruteResult = BruteTemplate(arr, value);
        System.out.println("Brute Result: " + bruteResult);
    }

    public static int BruteTemplate(int[] arr, int value) {
        int n = arr.length;
        int longestSubarrayLength = 0;

        // Iterate through all possible starting points of a subarray
        for (int subArrStart = 0; subArrStart < n; subArrStart++) {
            int currentSum = 0;
            // Iterate through all possible ending points of a subarray
            for (int subArrEnd = subArrStart; subArrEnd < n; subArrEnd++) {
                currentSum += arr[subArrEnd];

                // Check if the current subarray's sum meets the condition
                if (currentSum <= value) {
                    // Calculate the length of the current subarray
                    int currentLength = subArrEnd - subArrStart + 1;
                    // Update the longestSubarrayLength if the current one is longer
                    if (currentLength > longestSubarrayLength) {
                        longestSubarrayLength = currentLength;
                    }
                }
            }
        }
        return longestSubarrayLength;
    }
}