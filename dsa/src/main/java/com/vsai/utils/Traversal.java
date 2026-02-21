package com.vsai.utils;

public class Traversal {

    // func: print matrix in 2d array format
    public static void printMatrix(int[][] matrix) {
        //iterate on each row
        for (var row : matrix) {
            for (var elem : row) {
                // print each element column-wise with spaces
                System.out.print(elem + " ");
            }
            // for each new row, enter newline
            System.out.println();
        }
    }
}
