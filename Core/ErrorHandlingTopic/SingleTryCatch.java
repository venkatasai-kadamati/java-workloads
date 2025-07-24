package Core.ErrorHandlingTopic;

public class SingleTryCatch {
    public static void main(String[] args) {
        int nominator, denominator, z;

        nominator = 10;
        denominator = 0;

        try {
            z = nominator / denominator;
            System.out.println(z);
            System.out.println("Program End, Ran Successfully");
        } catch (ArithmeticException e) {
            System.out.println("Program End Failed => " + e);
        }

    }
}
