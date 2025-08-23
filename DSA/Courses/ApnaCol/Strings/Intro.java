package DSA.Courses.ApnaCol.Strings;

import java.util.Scanner;

public class Intro {
    // when we are required to store anything as text in memory, we end up preferring Strings
    // a char array is very different from String, String class has much more functionality
    // char[] letters = {'a', 'b', 'c'};
    // String str = "abcdef";
    public static void printString(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        char[] arr = {'a', 'b', 'c', 'd'};

        // ! string creation
        // Below are 2 methods to create a string, both differ only at implementation level only.
        String str = "venkatasai";
        // String str_new = new String("xyz");

        // Strings are IMMUTABLE - any change done, creates a completely new string.


        // ! string input and output
        // input
        Scanner sc = new Scanner(System.in);
        // name = sc.next(); // considers only one word
        // String name = sc.nextLine();
        String name = "Sidon Haves";

        // output
        System.out.println(name);

        // ! string length
        int len = name.length();
        System.out.println(len);
        // in array length is a property, wherein in string it's a method

        // ! string concatenation
        String firstName = "Venkat";
        String lastName = "Kadamati";

        String fullName = firstName + " " + lastName;
        System.out.println(fullName);

        // ! string charAt method
        System.out.println(fullName.charAt(0));
        System.out.println(fullName.charAt(1));
        printString(fullName);

        // ! string comparison
        String s1 = "Tony";
        String s2 = "Tondy";

        // Do not use == for string comparison, as it checks reference equality, not content.
        // Always use .equals() to compare string values.
        boolean areStringsEqual = s1.equals(s2);
        System.out.println("Are the strings equal? " + areStringsEqual);

        // ! substring
        // consecutive characters form a substring
        // org_string: "Hello World", substring: "Hell", subsequence: "erd"
        // substring has 2 indexes - starting and ending (exclusive)

        // inbuilt method from String class
        String inbuildOutput = str.substring(1, 3);
        System.out.println("substring generated using inbuilt : " + inbuildOutput);
        StringBuilder generatedSubstring = genSubstring(str, 1, 3);
        // custom code to generate substring
        System.out.println("substring generated using custom code: " + generatedSubstring);

    }

    public static StringBuilder genSubstring(String str, int startIndex, int endIndex) {
        StringBuilder currSubstring = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (i >= startIndex && i < endIndex) {
                currSubstring.append(str.charAt(i));
            }
        }
        return currSubstring;
    }
}