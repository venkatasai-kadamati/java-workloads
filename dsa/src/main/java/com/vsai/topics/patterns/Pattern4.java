package com.vsai.topics.patterns;

public class Pattern4 {
    public static void main(String[] args) {
        //       *
        //     * * *
        //   * * * * *
        // * * * * * * * *

        // first half sol
        // _ _ _
        // _ _
        // _

        // row & cols
        int rows = 4;
        int cols = 4;

        // outer loop -> rows
        for (int row = 1; row <= rows - 1; row++) {
            // 1st
            // inner loop -> rows
            for (int col = 1; col <= cols - row; col++) {
                System.out.print("_" + " ");
            }

            // 2rd half
            for (int col = 1; col <= ((row * 2) - 1); col++) {
                // printing
                System.out.print("*" + " ");
            }

            // 3rd half
            for (int col = 1; col <= cols - row; col++) {
                System.out.print("_" + " ");
            }

            System.out.println();
        }
    }
}
