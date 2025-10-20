package Core.GenericsTopic.EngineeringDigest.Intro;

import java.util.ArrayList;

public class WithoutGenerics {
    static void main() {
        int[] arr = new int[5];

        // we have created an arraylist that can hold any type of data => object type
        ArrayList list = new ArrayList();

        /*
        * 1. the below add operation is highlighted with the message saying "adding an element of raw type"
            error: Unchecked call to 'add(E)' as a member of raw type 'java.util.ArrayList'
        */
        list.add(1);
        list.add("Name");
        list.add(3.5);


        /*
        * 1. each of the list item is an object (raw type) now
                reason: all types are extended from root object class
        * 2. alternative: cast the object returned as required
                code: Integer str = (Integer) list.get(0);
        */

        Object o = list.get(0);
        Integer int_val = (Integer) list.get(1); // if you notice: essential we stored String, but we cast it to Integer and unfortunately no error is thrown at compile time. But during runtime a ClassCastException is noticed.
        // In short, our arrayList isn't type safe, programming is stored something and accessing something

        System.out.println(int_val);

        /**
        * Issues Noticed:
        * 1. Manual casting is required
        * 2. Type Safety Issue
        * 3. No compile time Check
        */

        /*
         * Solution: In java 5, Generics got introduced
         * Simply put, when creating a arrayList, mention explicitly what type of list we need.
        */



    }
}
