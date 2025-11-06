package DSA.Topicwise.Arrays.Basics;

public class BasicProblems {
    static void main() {
        int[] arr = {1, 2, 3, 4, 5, 11};

        // Problem 1: Find the sum of all elements in an array
        int sumOfAll = sumOfAllElem(arr);
        System.out.println("sum of all elements: " + sumOfAll);

        // Problem 2: Count of Odd numbers in an array
        int oddCnt = CountOfOdd(arr);
        System.out.println("count of odd: " + oddCnt);


    }

    private static int CountOfOdd(int[] nums) {
        int cnt = 0;

        for (int num : nums) {
            if (num % 2 != 0) {
                cnt++;
            }
        }

        return cnt;
    }

    private static int sumOfAllElem(int[] nums) {
        int total = 0;

        for (int num : nums) {
            total += num;
        }

        return total;
    }
}
