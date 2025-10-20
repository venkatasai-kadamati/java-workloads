package DSA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Demo {

    static void main() {
        List<String> list = new ArrayList<>();
        list.add("First");
        list.add("Second");
        list.add("Third");
        list.add("Fourth");
        list.add("Fiftieth");

        System.out.println("Org List: " + list);

        // ascending sort
        // expected: Fiftieth, First, Fourth, Second, Third
        //Collections.sort(list);

        // descending sort
        // expected: Third, Second, Fourth, First, Fiftieth
        // 1. using comparators
        //Collections.sort(list);
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String str1, String str2) {
                if (str1.compareTo(str2) > 0) {
                    return -1;
                } else if (str1.compareTo(str2) < 0) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });

        // 2. using lambda
        //Collections.sort(list, (str1, str2) -> str2.compareTo(str1));

        // practice the 2 types -> using function, lambda's implementation
        // assignment: try to build a max heap using PriorityQueue Interface (min-heap) variant + comparator.
        System.out.println("Sorted List: " + list);
    }
}
