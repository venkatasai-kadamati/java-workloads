package DSA.Topicwise.Arrays;

public class LongestSubarrayWithSumK {
    public static void main(String[] args) {

        // brute force approach
        int[] arr = {1, 2, 3, 4};

        for (int i = 0; i < arr.length; i++) {
            System.out.println("start -" + " with index :" + i + " and value :" + arr[i]);
            for (int j = i; j < arr.length; j++) {
                System.out.println(arr[j]);
            }
        }
    }
}
