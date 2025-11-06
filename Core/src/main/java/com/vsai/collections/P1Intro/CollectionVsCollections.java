package Core.CollectionTopic.P1Intro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionVsCollections {
    public static void main(String[] args) {
        // ! Collection - Interface
        List<Integer> values = new ArrayList<>();
        values.add(101);
        values.add(22);
        values.add(3);

        // ! Collections - Utility Class with static methods
        System.out.println("Max Value: " + Collections.max(values));
        System.out.println("Min Value: " + Collections.min(values));
        Collections.sort(values);
        System.out.println("Sort Value: " + values);
    }
}
