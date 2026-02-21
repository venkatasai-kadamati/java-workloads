package com.vsai.topics.patterns;

public class Pattern2 {
    public static void main(String[] args) {
        // *
        // * *
        // * * *
        // * * * *

        // row & cols
        int rows = 4;

        // outer loop -> row
        for (int row = 1; row <= rows; row++) {
            // inner loop -> col
            for (int col = 1; col <= row; col++) {
                System.out.print("*" + " ");
            }
            // jump to new line
            System.out.println();
        }
    }
}
