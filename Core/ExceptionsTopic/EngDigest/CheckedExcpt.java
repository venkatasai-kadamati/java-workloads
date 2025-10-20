package Core.ExceptionsTopic.EngDigest;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExcpt {
    static void main() throws IOException {
        method2();
        System.out.println("Hello");

        /*
        The below is one way of using IOException
        try {
            FileReader fileReader = new FileReader("a.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e);
            System.out.println(" e: Please create or choose the path clearly");
        }
        */
    }

    public static void method1() {
        FileReader fileReader = new FileReader("a.txt");
    }

    public static void method2() throws FileNotFoundException {
        method1();
    }
}
