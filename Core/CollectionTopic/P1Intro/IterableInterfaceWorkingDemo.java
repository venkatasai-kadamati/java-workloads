package Core.CollectionTopic.P1Intro;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
    Summary: When to use and overview of Iteration over Collection
    1. Using Iterable Interface - not used heavily
    2. Using Enhanced For Loop - super common and easy to follow
    3. Using forEach Method from Iterator Interface (Lambda Expression) - easy but versatile :: In this case we indirectly call the functional Interface and thus use internal Enhanced for loop only, which is abstracted from us.
 */

public class IterableInterfaceWorkingDemo {
    public static void main(String[] args) {

        // ! First, let's create a Collection to Iterate upon.
        // ? Why List on the left and ArrayList on the Right? -- Answer: Since List is an Interface and since ArrayList is an object of child Concrete Class, we can reference the object of Arraylist to List.
        List<Integer> values = new ArrayList<>();

        values.add(1);
        values.add(2);
        values.add(3);
        values.add(4);

        // ! Using Iterator
        System.out.println("Iterating the values using iterator method present in Iterator Interface");
        // iterator method returns an iterator object
        Iterator<Integer> valuesIterator = values.iterator();

        // the above Iterator object has the following methods to iterate over the collection: hasNext(), next(), remove()
        while (valuesIterator.hasNext()) {
            int val = valuesIterator.next();
            System.out.println(val);
            if (val == 3) {
                valuesIterator.remove();
            }
        }

        // ! Using Enhanced For Loop:
        System.out.println("Iterating the values using for-each loop");
        for (int val : values) {
            System.out.println(val);
        }

        // ! Using forEach method
        System.out.println("Iterating using forEach method");
        values.forEach((Integer val) -> System.out.println(val));

    }
}
