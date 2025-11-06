package DSA.Courses.ApnaCol.MultiDimArr;

public class Matrixs {

    public static void main(String[] args) {
        System.out.println("Starting with 2d array");

        //int[][] matrix = new int[2][3];
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        int rows = matrix.length;
        int cols = matrix[0].length;

        // take input and create matrix through CLI
//        Scanner sc = new Scanner(System.in);
//        for (int row = 0; row < rows; row++) {
//            for (int col = 0; col < cols; col++) {
//                matrix[row][col] = sc.nextInt();
//            }
//        }


        printMatrix(matrix, cols);

//        int searchKey = 33;
//        boolean elementIsPresent = searchMatrix(matrix, searchKey, cols);
//        System.out.println("The key is present in our matrix: " + elementIsPresent);
    }

    // func: print contents of given matrix
    public static void printMatrix(int[][] matrix, int cols) {
        // output
        for (int[] arrRows : matrix) {
            for (int col = 0; col < cols; col++) {
                System.out.print(arrRows[col] + " ");
            }
            System.out.println();
        }
    }

    // func: search a given element in matrix
    public static boolean searchMatrix(int[][] matrix, int key, int cols) {
        for (int[] arrRows : matrix) {
            for (int col = 0; col < cols; col++) {
                if (key == arrRows[col]) {
                    return true;
                }
            }
        }
        return false;
    }

    // func: find the largest element in matrix
    public static int maxElement(int[][] matrix, int cols, boolean getMax) {
        int maxElem = Integer.MIN_VALUE;

        for (int[] arrRows : matrix) {
            for (int col = 0; col < cols; col++) {
                if (maxElem < arrRows[cols]) {
                    maxElem = arrRows[cols];
                    break;
                }
            }
            System.out.println();
        }
        return maxElem;
    }
}
