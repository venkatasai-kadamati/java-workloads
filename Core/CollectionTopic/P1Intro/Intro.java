package Core.CollectionTopic.P1Intro;

import java.util.Vector;

/*
    The below code uses an implementation example of both array and vector to showcase what is to code without collections.

    We can notice that for both arr and vector code snippets the methods used are different, making it less standard and hard to remember.

    The above is the main reason for introducing collections. We aim to manage all these so-called groups of objects effectively using a framework called as the Java Collection Framework (JCF).
 */
public class Intro {
    public static void main(String[] args) {
        // ! array
        int[] arr = new int[4];

        // write - insert an element in an array
        arr[0] = 1;
        // read - get a front element
        int val = arr[0];

        // ! vector
        Vector<Integer> vec = new Vector<>();
        // write - insert an element in an array
        vec.add(1);
        // read - get a front element
        int output = vec.get(0);
    }
}
