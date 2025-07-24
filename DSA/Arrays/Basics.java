package DSA.Arrays;

// Arrays are really helpful for storing several similar type data using a single variable definition
// Arrays are simple objects in Java, so need to use "new" keyword to work with them.
// Based on 0-indexing
// Array in short is a list of elements of the same type and is placed in a contiguous memory location

// operations in an array
// create
// input
// output

public class Basics {
    public static void main(String[] args) {


        // creating an array
        // template - datatype <array_name>[] = new datatype[size];
        //  the first part is declaration, and new helps us with initialization in memory.
        int[] intArr = new int[5];
        char[] charArr = new char[5];
        String[] strArr = new String[5];
        boolean[] boolArr = new boolean[5];

        int[] numbers = {1, 2, 3};


        System.out.println(intArr);

    }
}
