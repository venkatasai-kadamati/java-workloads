package com.vsai.courses.Kunal.Recursion;

public class Strings {
    public static void main(String[] args) {
        // basic string questions
        // ! question 1: remove all specific letter instances from string
        // the above can be solved in 2 approaches: one passing the new string in argument, the second is to just use function body to update new String
        String inputStr = "each";
        // String inputStr = "texas bound area with article 3";
        // approach 1: passing the newString as argument
        StringBuilder newString = new StringBuilder();
        removeLetterApp1(inputStr, 'a', 0, newString);
        System.out.println("new string after removing specific letter using app 1: " + newString);

        String removedOutput = removeLetterApp2(inputStr);
        System.out.println("new string after removing specific letter using app 2: " + removedOutput);
    }

    // func: remove a specific letter from the string by just using the function body
    public static String removeLetterApp2(String str){
        if (str.isEmpty()){
            return "";
        }
        char currChar = str.charAt(0) != 'b' ? str.charAt(0) : ' ';
        return currChar + removeLetterApp2(str.substring(1));
    }

    // func: remove a specific letter from the string by passing new String in recursive argument
    // tc: O(n) & sc: O(n)
    public static void removeLetterApp1(String str, char target, int idx, StringBuilder newString){
        // base case
        if(idx == str.length()){
            return;
        }

        System.out.println("iteration with idx value : " + idx);
        // action
        if(str.charAt(idx) != target){
            newString.append(str.charAt(idx));
        }

        // recursive call
        removeLetterApp1(str, target, idx + 1, newString);
    }
}
