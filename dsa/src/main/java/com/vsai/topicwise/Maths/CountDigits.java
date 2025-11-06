package DSA.Topicwise.Maths;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class CountDigits {
    static void main() {
        // sort chars by frequency
        String s = "tree";

        TreeMap<Character, Integer> map = new TreeMap<>();

        // N times - worst case
        for (Character ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        System.out.println(map);

        // let's use treemap for sorted keys w.r.t freq and then iterate on keys

        // Sc: O(1)
        List<Character> newCh = new ArrayList<>(map.keySet());

        System.out.println(newCh);


    }
}

// think of
