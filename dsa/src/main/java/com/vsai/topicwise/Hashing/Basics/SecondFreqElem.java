package DSA.Topicwise.Hashing.Basics;

import java.util.HashMap;

// TODO: PENDING
public class SecondFreqElem {
    static void main() {
        int[] arr = {11, 11, 9, 9, 10, 10, 1, 1, 1, 2, 2, 2, 3, 3, 3, 3, 3};
        int output = secondMostFrequentElement(arr);
        System.out.println("second freq elem: " + output);
    }

    public static int secondMostFrequentElement(int[] nums) {
        // edge cases
        // 1. array size is just 1 or hashmap has just one Value
        if (nums.length == 1) {
            return -1;
        }

        // hashmap creation & population
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        System.out.println("map: " + map);

        // 2. the hashmap has just 2 entries with same frequency
        if (map.size() == 1) {
            return -1;
        }

        // another thing is if the frequencies are same then also -1. simply no 2nd largest (PENDING)

        int secMaxKey = getSecMaxKey(nums, map);

        return secMaxKey;
    }

    private static int getSecMaxKey(int[] nums, HashMap<Integer, Integer> map) {
        int firstMax = 1;
        int maxKey = nums[0];
        int secondMax = 0;
        int secMaxKey = Integer.MIN_VALUE;

        // iterate on each map entry
        for (var entry : map.entrySet()) {
            int currFreq = entry.getValue();
            int currKey = entry.getKey();

            if (currFreq > firstMax) {
                // setting the previous largest as secondLargest
                secondMax = firstMax;
                secMaxKey = maxKey;

                firstMax = currFreq;
                maxKey = currKey;
            }
        }
        return secMaxKey;
    }
}
