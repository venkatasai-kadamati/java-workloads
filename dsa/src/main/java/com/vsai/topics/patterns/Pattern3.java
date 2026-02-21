package com.vsai.topics.patterns;

public class Pattern3 {
    public static void main(String[] args) {
        // * * * *
        // * * *
        // * *
        // *

        // row & cols
        int rows = 4;
        int cols = 4;

        // outer loop -> row
        for (int row = 1; row <= rows; row++) {
            // inner loop -> col
            // to reach in decreasing manner we need to
            // cols - row + 1
            for (int col = 1; col <= cols - row + 1; col++) {
                System.out.print(row + " ");
            }
            // jump to new line
            System.out.println();
        }
    }
}
