package DSA.Courses.ApnaCol.MultiDimArr;

/*
   The idea here is to understand that for every spiral completion we move inwards till center.
   So that means we first trace the outer boundary fully and then inner and so on.

   Outer boundary has 4 boundaries to be printed in order: top > right > bottom > left

   To keep track of these boundaries, we need to use variables and update them for each outer spiral completion. This allows us to properly focus on printing as required.


   !!! Key things to understand:
   1. How to decide the while condition and clearly drily run it for both n x n and n x m matrices
   2. Understand the logic of movement, suppose in the top only cols move with startRow as fixed.
 */

public class SpiralMatrix {
    public static void main(String[] args) {
        // input matrix
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        // func: print matrix in spiral fashion
        printSpiral(matrix);
    }

    public static void printSpiral(int[][] matrix) {
        // define boundaries
        int rows = matrix.length - 1;
        int cols = matrix[0].length - 1;

        int startRow = 0;
        int endRow = rows;
        int startCol = 0;
        int endCol = cols;

        while (startRow <= endRow && startCol <= endCol) {
            // each boundary is a standalone array. So one loop is enough.
            
            // top
            for (int col = startCol; col <= endCol; col++) {
                System.out.print(matrix[startRow][col] + " ");
            }

            // right
            for (int row = startRow + 1; row <= endRow; row++) {
                System.out.print(matrix[row][endCol] + " ");
            }

            // bottom
            for (int col = endCol - 1; col >= startCol; col--) {
                System.out.print(matrix[endRow][col] + " ");
            }

            // left
            for (int row = endRow - 1; row >= startRow + 1; row--) {
                System.out.print(matrix[row][startCol] + " ");
            }

            startCol += 1;
            startRow += 1;
            endRow -= 1;
            endCol -= 1;
        }
    }
}
