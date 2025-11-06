package DSA.Topicwise.SlidingWindow;

// sliding window with constant window implementation
// Question: Find the max sum possible with 4 consecutive elements

// Always first refer: Template and then brute approach (normalImplementation) & then optimized approach
public class ConstantWindowPattern {

    public static void main(String[] args) {
        int[] arr = {-1, 2, 3, 3, 4, 5, -1};
        int windowSize = 4;
        // int[] arr = {-5, -2, -3, -1};  // All negative numbers
        // int windowSize = 2;

        // ! edge case: if a window is greater than arr size
        if (windowSize > arr.length) {
            System.out.println("Window size is greater than array length");
            return;
        }

        int normalResult = normalImplementation(arr, windowSize);
        System.out.println("Result from normal implementation: " + normalResult);

        int optimizedResult = optimizedImplementation(arr, windowSize);
        System.out.println("Result from optimized implementation: " + optimizedResult);

        int templateResult = template(arr, windowSize);
        System.out.println("Result from template implementation: " + templateResult);
    }

    // The below normal Implementation is also correct, but the issue is that we are doing computation again and again. For every iteration, we are calculating the sum of the whole window again ... This isn't recommended for large windows and huge arrays
    public static int normalImplementation(int[] arr, int windowSize) {
        // the initial maxSum shouldn't be 0 as we might end up having total windowSum -ve.
        int maxSum = Integer.MIN_VALUE;
        int n = arr.length;

        // ! template start
        // ** defines 2 pointers - START & END for a window
        int winStart = 0;
        int winEnd = windowSize - 1;

        // ** iterate till winEnd crosses the end of an array
        while (winEnd < n) {
            int currWindSum = 0;

            // ? optimize this: we are repeatedly calculating the window sum.
            for (int i = winStart; i <= winEnd; i++) {
                currWindSum += arr[i];
            }

            maxSum = Math.max(maxSum, currWindSum);
            winStart++;
            winEnd++;
        }

        return maxSum;
    }

    // The below is an optimized variant, based on own implementation, has few bugs but refer at last only to understand proper sliding without recomputation.
    public static int optimizedImplementation(int[] arr, int windowSize) {

        int n = arr.length;
        int winStart = 0;
        int winEnd = windowSize - 1;
        int winSum = 0;

        for (int i = winStart; i <= winEnd; i++) {
            winSum += arr[i];
        }

        // We assume that the first window sum is the maximum
        int maxSum = winSum;

        // This computes only for 2 items.
        while (winEnd < n) {

            winSum -= arr[winStart];
            winStart++;

            winEnd++;
            if (winEnd == n) {
                continue;
            } else {
                winSum += arr[winEnd];
            }

            maxSum = Math.max(maxSum, winSum);
        }
        return maxSum;
    }

    // Template implementation from a previous chat - Clean and efficient sliding window
    public static int template(int[] arr, int windowSize) {
        int n = arr.length;

        // Handle an edge case where an array is smaller than the window
        if (n < windowSize) {
            return Integer.MIN_VALUE; // or throw an exception
        }

        // ! Optimized template start

        // ** Step 1: Calculate the sum of the first window
        int windowSum = 0;
        for (int i = 0; i < windowSize; i++) {
            windowSum += arr[i];
        }

        // ** Initialize maxSum with the sum of the first window
        // This also handles cases where all numbers might be negative
        int maxSum = windowSum;

        // ** Step 2: Slide the window from the end of the first window to the end of the array
        // The loop starts from windowSize because the first window (0 to windowSize-1) is already processed.
        for (int winEnd = windowSize; winEnd < n; winEnd++) {
            // "Slide" the window:
            // Add the new element entering the window (arr[winEnd])
            // Subtract the old element leaving the window (arr[winEnd - windowSize])
            windowSum = windowSum + arr[winEnd] - arr[winEnd - windowSize];

            // Update the maximum sum found so far
            maxSum = Math.max(maxSum, windowSum);
        }
        // ! template end

        return maxSum;
    }
}
