package DSA.Topicwise.Hashing.Others;

import java.util.Arrays;
import java.util.HashSet;

// Q. Longest Consecutive Sequence in an Array
//Return the length of the longest sequence of consecutive integers.

public class LongestConsSeq {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        //int[] arr = {1,2,3,3,4,6,7,13};
        //int[] arr = {1,2,3,3,4,6,7,13, 100, 101,102, 103, 104, 105};
        System.out.println(Arrays.toString(arr));

        // brute approach
        int result = longestConsecutiveA1(arr);

        // optimal approach
        int result2 = longestConsecutiveA2(arr);
        System.out.println("output: " + result2);
    }

    // approach 2: using hashset
    private static int longestConsecutiveA2(int[] nums){
        // Tc: O(N) + O(1) => O(N)
        // convert into hashset (to avoid duplicates)
        HashSet<Integer> hset = new HashSet<>();

        // populate the set with arr elements - O(N)
        for(int num: nums){
            hset.add(num);
        }
        System.out.println("hash set: " + hset);

        int n = nums.length;
        int maxStreak = 1;
        int currStreak = 1;

        for(int i = 1; i < n; i++){
            // faster loop + no duplicates
            if (hset.contains(nums[i] + 1)){
                currStreak++;
            }else{
                maxStreak = Math.max(currStreak, maxStreak);
                currStreak = 1;
            }
                // O(1)
        }
        return Math.max(currStreak, maxStreak);
    }

    // approach 1: use sorting + if streak breaks counter incr.
    private static int longestConsecutiveA1(int[] nums){
        // Tc: O(N log N) + O(N)
        int n = nums.length;

        if( n == 0 || n == 1 ){
            return n;
        }

        // Sort the array
        Arrays.sort(nums); // N log(N)

        int maxLongestSeq = 1;
        int longestSeq = 1;

        // n
        for(int i = 1; i <= n-1; i++){
            if ( nums[i] == nums[i-1] + 1 ){
                longestSeq++;
            }else if(nums[i] != nums[i-1] + 1 && nums[i] != nums[i-1]){
                maxLongestSeq = Math.max(maxLongestSeq, longestSeq);
                longestSeq = 1;
            }
        }

        // just in case we don't break the counter
        maxLongestSeq = Math.max(maxLongestSeq, longestSeq);
        return maxLongestSeq;
    }
}
