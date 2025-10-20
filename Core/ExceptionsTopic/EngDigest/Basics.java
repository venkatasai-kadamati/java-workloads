package Core.ExceptionsTopic.EngDigest;

public class Basics {
    static void main() {
        int[] numerators = {10, 200, 30, 40};
        int[] denominators = {1, 2, 0, 4};

        // Demonstrate ArithmeticException handling
        for (int i = 0; i < numerators.length; i++) {
            System.out.println(divide(numerators[i], denominators[i]));
        }

        // Demonstrate NullPointerException separately
        demonstrateNullPointer();

        // Demonstrate IndexOutOfBoundsException handling
        demonstrateIndexOBException();

        System.out.println("Smooth execution");
    }

    public static void demonstrateIndexOBException() {
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("IndexOutOfBoundsException: " + e.getMessage());
        }
    }

    public static int divide(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
            return -1;
        }
    }

    public static void demonstrateNullPointer() {
        try {
            String str = null;
            int length = str.length();
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: " + e.getMessage());
        }
    }
}
