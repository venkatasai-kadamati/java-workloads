package DSA.Courses.ApnaCol.MultiDimArr;

// diagonal sum is calculated only for n x n matrix
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
        System.out.println("The diagonal sum of the matrix is : " + result);
    }

    public static int calcDiagonalSum(int[][] matrix) {
        // we process in 2 splits - left diag + right diag

        int rows = matrix.length - 1;
        int cols = matrix[0].length - 1;

        int diagSum = 0;


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

        diagSum = leftDiagSum + rightDiagSum;
        return diagSum;
    }
}
