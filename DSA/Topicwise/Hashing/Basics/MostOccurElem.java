package DSA.Topicwise.Hashing.Basics;

import java.util.HashMap;

// Find the most occurring elem
public class MostOccurElem {
    static void main() {
        int[] arr = {3, 3, 1, 1, 2, 2, 6};
        int n = arr.length;

        // approach -> use nested loop to check for elem
        int bruteOutput = brute(arr, n);
        System.out.println(bruteOutput);

        // approach -> use hashmaps
        int optimalOutput = optimal(arr, n);
        System.out.println(optimalOutput);

    }

    private static int brute(int[] arr, int n) {
        // Tc: O(N^2)
        // Sc: O(1)
        // idea is to iterate and check again in a nested manner.
        int maxFreq = 0;
        int maxKey = arr[0];

        for (int num : arr) {
            int currCnt = 0;

            for (int check : arr) {
                if (num == check) {
                    currCnt++;
                }
            }

            if (currCnt > maxFreq) {
                maxFreq = currCnt;
                maxKey = num;
            } else if (currCnt == maxFreq) {
                maxKey = Math.min(maxKey, num);
            }
        }

        return maxKey;
    }

    private static int optimal(int[] arr, int n) {
        // Tc: O(N) -> Actually it is close to (N * M) where N is array size and M is map size. But in worst case, if the array is unique. Then N == M.
        // Sc: O(N) -> In worst case, the array is unique and the map has N keys to hold frequency of each 1.

        // idea: use hashmap to get the frequencies first, then iterate over each entry and find the largest.
        int maxKey = arr[0];
        int maxFreq = 0;

        // creating hashmap
        HashMap<Integer, Integer> map = new HashMap<>();

        // populating map
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        System.out.println("map: " + map);

        // iterate over map using entrySet()
        for (var entry : map.entrySet()) {
            if (maxFreq < entry.getValue()) {
                maxFreq = entry.getValue();
                maxKey = entry.getKey();
            } else if (maxFreq == entry.getValue()) {
                maxKey = Math.min(maxKey, entry.getKey());
            }
        }

        return maxKey;
    }
}
