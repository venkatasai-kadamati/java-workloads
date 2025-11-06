package DSA.Courses.ApnaCol.MultiDimArr;

public class PracticeQues {
    public static void main(String[] args) {
        int[][] matrix = loadMatrix();

        // question 1: print the number of 7's present in matrix
        int numOf7s = getCntOf7s(matrix);
        System.out.println("Number of 7's in matrix: " + numOf7s);

        // question 2: calculate the sum of numbers in the second row of matrix
        int totalOfRow2 = sumOfRow2(matrix);
        System.out.println("sum of all numbers in second row: " + totalOfRow2);

        // question 3: transpose matrix
        int[][] transposedMatrix = transpose(matrix);
        printMatrix(transposedMatrix);
    }

    // func: transpose matrix
    public static int[][] transpose(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return new int[0][0];
        }
        int rowCount = matrix.length;
        int colCount = matrix[0].length;
        int[][] result = new int[colCount][rowCount];

        for (int r = 0; r < rowCount; r++) {
            int[] row = matrix[r];
            for (int c = 0; c < colCount; c++) {
                result[c][r] = row[c];
            }
        }

        return result;
    }

    // func: get count of 7 present in matrix
    public static int getCntOf7s(int[][] matrix) {
        int countOf7 = 0;

        for (int[] singleRow : matrix) {
            for (int elem : singleRow) {
                if (elem == 7) countOf7++;
            }
        }
        return countOf7;
    }

    // func: calculate the sum of numbers in the second row of matrix
    public static int sumOfRow2(int[][] matrix) {
        int total = 0;

        for (int elem : matrix[1]) {
            total += elem;
        }
        return total;
    }

    // ** utils
    public static void printMatrix(int[][] matrix) {

        for (int[] singleRow : matrix) {
            for (int elem : singleRow) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }

    public static int[][] loadMatrix() {
        // testcase: n x m, where n != m
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
        };

        // testcase: n x n, where n is odd
        // int[][] matrix = {
        //         {1, 4, 9},
        //         {11, 4, 3},
        //         {2, 2, 3}
        // };

        // testcase : n x n, where n is even
        // int[][] matrix = {
        //         {1, 2, 3, 4},
        //         {5, 6, 7, 8},
        //         {9, 10, 11, 12},
        //         {13, 14, 15, 16}
        // };

        return matrix;
    }
}