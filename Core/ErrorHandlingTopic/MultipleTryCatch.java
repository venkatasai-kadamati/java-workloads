package Core.ErrorHandlingTopic;

public class MultipleTryCatch {
    public static void main(String[] args) {
        int[] arr = {10, 0, 3, 1, 4};

        int divVal;
        int elemVal;

        try {
            divVal = arr[0] / arr[3];
            elemVal = arr[10];
            System.out.println(divVal);
        } catch (ArithmeticException | IndexOutOfBoundsException e) {
            System.out.println("Program End Failed => " + e);
        }

    }
}
