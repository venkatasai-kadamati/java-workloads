package com.vsai.topics.patterns;

public class Demo {
    public static void main(String[] args) {
        // outer row
        for (int row = 1; row <= 10; row++) {
            // do all the work and then move to new line
            // first in sinlge line print space + star + space
//            System.out.print("current row: " + row);
            for (int i = 1; i <= 3; i++) System.out.print("_" + " ");
            for (int i = 1; i <= 3; i++) System.out.print("*" + " ");
            for (int i = 1; i <= 3; i++) System.out.print("_" + " ");

            System.out.println();
        }
    }
}
