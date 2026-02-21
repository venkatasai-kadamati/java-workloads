package com.vsai.topics.patterns;

public class Patter9 {
    public static void main(String[] args) {
        // rows & cols
        int rows = 4;
        int valueToPrint = 1;

        // outer loop -> rows
        for (int row = 1; row <= rows; row++) {
            // inner loop -> cols

            if (row % 2 == 0) {
                valueToPrint = 0;
            }
            for (int col = 1; col <= row; col++) {
                if (valueToPrint == 0) {
                    valueToPrint = 1;
                }
                // check even
                System.out.print(valueToPrint + " ");

            }
            System.out.println();
        }


    }
}
