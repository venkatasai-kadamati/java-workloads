package Core.CollectionTopic.P2CompCmpblPQ.EngDigest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Comparator {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();

        list.add(1);
        list.add(2);
        list.add(3);

        list.sort(null);

        System.out.println(list);

        //
        List<String> words = Arrays.asList("e", "a", "cab", "bob");
        words.sort(null);
        System.out.println(words);
    }
}
