package DSA.Courses.ApnaCol.Strings;

import java.util.Arrays;

public class Problems {
    public static void main(String[] args) {

        String str = "Venkatesh";

        // ! question 1: Check if String is Palindrome
        boolean palindromeOutput = isPalindrome(str);

        // ! question 2: find the shortest path to reach destination
        // String directions = "WNEENESENNN";
        String directions = "NS";
        int shortestDist = shortestPath(directions);
        System.out.println("shortest distance : " + shortestDist);

        // question 3: find the largest String, lexically
        // we can use compareTo method from String class to solve above
        // str1.compareTo(str2) or str1.compareToIgnoreCase(str2)
        // if output is 0 then both are equal
        // if output is -1 then str1 is smaller
        // if output is +1 then str1 is larger

        String[] fruits = {"apple", "mango", "banana"};
        String largestFruit = fruits[0];
        for (int i = 1; i < fruits.length; i++) {
            String curr = fruits[i];
            if ((curr.compareTo(largestFruit)) > 0) {
                largestFruit = curr;
            }
        }

        System.out.println(largestFruit);

        // ! question 3: Convert each first letter of each string to Uppercase
        StringBuilder orgString = new StringBuilder("aaabbcccdd");
        // String modifiedString = convertToUpperCase(orgString);
        // System.out.println("The modified string is: " + modifiedString);

        // ! question 4: string compression
        String compressedString = compressString(orgString);
        System.out.println("compressed string: " + compressedString);

        // ! question 5: count lowercase vowels in String
        int vowelCount = countVowels(orgString.toString());
        System.out.println("count of vowels: " + vowelCount);
        //String.valueOf(orgString)

        // ! question 6: check anagram
        String str1 = "Earth";
        String str2 = "Heart";
        boolean result = isAnagram(str1, str2);
        System.out.println("both strings are anagram: "+ result);
    }

    public static boolean isAnagram(String str1, String str2){
        if(str1.length() != str2.length()) return false;
        // convert into lowercase for safety and convert into a char array
        char[] str1Array = str1.toLowerCase().toCharArray();
        char[] str2Array = str2.toLowerCase().toCharArray();

        // sort for direct comparsion
        Arrays.sort(str1Array);
        Arrays.sort(str2Array);

        // comparsion
        boolean result = Arrays.equals(str1Array, str2Array);
        return result;
    }

    public static int countVowels(String orgStrings){
        int count = 0;
        for(int i = 0; i< orgStrings.length(); i++){
            char ch = orgStrings.charAt(i);
            if( ch == 'a' || ch == 'e' || ch == 'i' || ch  == 'o' || ch == 'u'){
                count++;
            }
        }
        return count;
    }

    // func: compress string
    public static String compressString(StringBuilder orgString) {
        // first count each char and then append newly
        StringBuilder newString = new StringBuilder();

        char currChar = orgString.charAt(0);
        int charCount = 1;
        for (int i = 1; i < orgString.length(); i++) {
            if (orgString.charAt(i) != currChar) {
                newString.append(currChar).append(charCount);
                currChar = orgString.charAt(i);
                charCount = 1;
            } else {
                charCount++;
            }
        }

        // append the last run
        newString.append(currChar).append(charCount);
        return newString.toString();
    }

    // func: convert to uppercase each first letter
    public static String convertToUpperCase(StringBuilder orgString) {
        StringBuilder newString = new StringBuilder();
        newString.append(Character.toUpperCase(orgString.charAt(0)));
        for (int i = 1; i < orgString.length(); i++) {
            if (Character.isWhitespace(orgString.charAt(i - 1))) {
                newString.append(Character.toUpperCase(orgString.charAt(i)));
            } else {
                newString.append((orgString.charAt(i)));
            }
        }
        return newString.toString();
    }

    // func: checks if the string is palindrome
    public static boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start <= end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    // func: shortest path to reach destination
    public static int shortestPath(String str) {
        int x = 0;
        int y = 0;

        int output = 0;
        for (int i = 0; i < str.length(); i++) {
            char value = str.charAt(i);

            // the idea is to use the displacement formula = sqrt(( x2 - x1)^2 - ( y2 - y1)^2)
            // for the above we need to first calculate the co-ordinates
            if (value == 'N') {
                y++;
            } else if (value == 'S') {
                y--;
            } else if (value == 'E') {
                x++;
            } else {
                x--;
            }


            output = (int) Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        }
        return output;
    }
}
