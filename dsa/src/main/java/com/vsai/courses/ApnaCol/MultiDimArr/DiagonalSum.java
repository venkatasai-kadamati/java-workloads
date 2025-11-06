package DSA.Courses.ApnaCol.MultiDimArr;

// diagonal sum is calculated only for n x n matrix

/**
 * approach 1 - using while loop and my own ideation, so easier to read and understand <p>
 * approach 2 - using for loop and best code practices, good for refactoring
 */
public class DiagonalSum {
    public static int[][] loadMatrix() {
        // testcase : n x n, where n is odd
        int[][] matrix = {
                {1, 2, 3,},
                {4, 5, 6},
                {7, 8, 9}
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
        int result = calcDiagonalSum(matrix);
        System.out.println("diagonal sum using while loop - easy to understand logic : " + result);

        int approach2Result = calcDiagonalSumApproach2(matrix);
        System.out.println("diagonal sum using for loop and cleaner code practice: " + approach2Result);
    }

    // approach 1
    public static int calcDiagonalSum(int[][] matrix) {
        // we process in 2 splits - left diag and right diag

        int rows = matrix.length - 1;

        int leftDiagSum = 0;
        int rightDiagSum = 0;
        int curr = 0;
        while (curr <= rows) {
            // computing left diagonal sum
            leftDiagSum = leftDiagSum + matrix[curr][curr];
            // computing right diagonal sum
            rightDiagSum = rightDiagSum + matrix[curr][rows - curr];

            curr++;
        }

        // ! edge case - for n x n where n is odd, we should remove the wrongly considered middle element twice while computing both primary and secondary diagonal.
        if ((rows + 1) % 2 == 1) {
            rightDiagSum = rightDiagSum - matrix[rows / 2][rows / 2];
        }

        return leftDiagSum + rightDiagSum;
    }

    /**
     * Calculates the diagonal sum of a square matrix in a single pass.
     * It sums the primary diagonal and the secondary diagonal,
     * ensuring the central element is not double-counted for odd-dimension matrices.
     *
     * @param matrix The square matrix (n x n).
     * @return The integer sum of its diagonals.
     */
    // approach 2
    public static int calcDiagonalSumApproach2(int[][] matrix) {
        // we process in 2 splits - left diag and right diag

        int rows = matrix.length - 1;

        int diagSum = 0;
        for (int curr = 0; curr < rows; curr++) {
            // handling primary diagonal
            diagSum = diagSum + matrix[curr][curr];

            int secondaryDiag = rows - curr;
            // handling secondary diagonal, the logic is that, for a middle element, curr won't match, so to work with only non-middle elements we do the below.
            if (curr != secondaryDiag) {
                diagSum = diagSum + matrix[curr][secondaryDiag];
            }
        }
        return diagSum;
    }
}
