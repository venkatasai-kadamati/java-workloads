package Core.CollectionTopic.P1Intro;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class CollectionInterfaceWorkingDemo {
    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>();
        values.add(1);
        values.add(2);
        values.add(3);

        // ! size
        System.out.println(values.size());

        // ! isEmpty
        System.out.println(values.isEmpty());

        // ! contains
        System.out.println(values.contains(1));

        // ! add
        System.out.println(values.add(4));

        // ! remove using index
        System.out.println(values.remove(2));

        // ! remove using Object, removes the first occurrences of the value
        System.out.println(values.remove(Integer.valueOf(3)));

        // ? stack
        Stack<Integer> stackValues = new Stack<>();
        stackValues.add(5);
        stackValues.add(6);
        stackValues.add(7);

        // ! addAll
        values.addAll(stackValues);

        // ! containsAll
        System.out.println("addAll test using containsAll: " + values.containsAll(stackValues));

        // ! removeAll
        values.removeAll(stackValues);
        System.out.println("removeAll :" + values.contains(7));

        // ! clear
        values.clear();
        System.out.println("Clear: " + values.isEmpty());
    }
}
