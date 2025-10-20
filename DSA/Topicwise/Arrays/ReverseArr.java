package DSA.Topicwise.Arrays;

import java.util.Arrays;
import java.util.HashMap;

public class ReverseArr {
    static void main() {
        int[] arr = {1, 3, 3, 4, 4};
        System.out.println(Arrays.toString(arr));

        HashMap<Integer, Integer> map = new HashMap<>();

        // populate the map -> O(N)
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int maxKey = arr[0];
        int maxCounter = 0;


        // iterating using entrySet() -> O(M)
        for (var entry : map.entrySet()) {
            // keys - getKey(); values - getValue() of each entry
            if (maxCounter < entry.getValue()) {
                maxCounter = entry.getValue();

                // what if both are same?? frequency wise
                maxKey = entry.getKey();
            } else if (maxCounter == entry.getValue()) {
                maxKey = Math.min(maxKey, entry.getKey());
            }
        }

        // return maxKey;
        // Tc: O(N + M) -> all are unique then (N+N) = 2N ~ N
        // Sc: O(N) -> in worst case if the whole array is unique, we will have n keys in our map.
    }
}
