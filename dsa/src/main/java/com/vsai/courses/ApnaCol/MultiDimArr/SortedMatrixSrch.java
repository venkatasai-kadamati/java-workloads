package DSA.Courses.ApnaCol.MultiDimArr;

import java.util.Arrays;

// This problem is popular and the search done here is called "staircase search"

/**
 * 1. The core logic is to understand: How we trace from top to the required key <p>
 * 2. Think from the last element of the 1st row … <p>
 * 3. We notice our possible movements are in only either bottom (key is larger) or left (key is smaller).
 */
public class SortedMatrixSrch {
    public static int[][] loadMatrix() {
        // testcase : n x n, where n is even
        int[][] matrix = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 37, 48},
                {32, 33, 39, 50}
        };

        // testcase : n x n, where n is even
        // int[][] matrix = {
        //         {1, 2, 3, 4},
        //         {5, 6, 7, 8},
        //         {9, 10, 11, 12},
        //         {13, 14, 15, 16}
        // };

        return matrix;
    }

    public static void main(String[] args) {
        int[][] matrix = loadMatrix();
        int key = 374;

        System.out.println(Arrays.deepToString(matrix));

        // brute method
        boolean bruteResult = bruteSearch(matrix, key);
        System.out.println("is key present using brute? : " + bruteResult);

        // optimized method
        boolean optResult = optSearch(matrix, key);
        System.out.println("is key present using opt search? : " + optResult);
    }

    // brute approach - search all items
    public static boolean bruteSearch(int[][] matrix, int key) {
        for (int[] subMatrix : matrix) {
            for (int currElem : subMatrix) {
                if (currElem == key) {
                    return true;
                }
            }
        }

        return false;
    }

    // optimized approach - search specific key with minimal steps
    public static boolean optSearch(int[][] matrix, int key) {
        int rows = matrix.length - 1;
        int cols = matrix[0].length - 1;

        int startRow = 0;
        while (startRow <= rows && cols >= 0) {
            if (key == matrix[startRow][cols]) {
                return true;
            }
            if (key < matrix[startRow][cols]) {
                // move left
                cols--;
            } else {
                startRow++;
            }
        }

        return false;
    }
}
