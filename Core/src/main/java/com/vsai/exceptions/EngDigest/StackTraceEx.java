package Core.ExceptionsTopic.EngDigest;

public class StackTraceEx {
    static void main() {
        try {
            level1();
        } catch (Exception e) {
            e.printStackTrace();
            e.getMessage();
        }
        System.out.println("done smoothly :)");
    }

    public static void level3() {
        // will throw IndexOutOfBound Exception
        int[] arr = new int[5];
        arr[5] = 10;
    }

    public static void level2() {
        level3();
    }

    public static void level1() {
        level2();
    }
}

