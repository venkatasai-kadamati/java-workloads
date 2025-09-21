package BackendSpring.BuildSystems.ExMultiFileSetup.example;

import BackendSpring.BuildSystems.ExMultiFileSetup.lib.Hello;
import BackendSpring.BuildSystems.ExMultiFileSetup.lib.Payment;
import BackendSpring.BuildSystems.ExMultiFileSetup.lib.UPIPayment;

public class Main {
    static void main() {
        System.out.println("Starting the code execution");

        // mfs (multi-file-system) example 1
        Hello.sayHello();

        // mfs example 2
        Payment p = new UPIPayment();
        p.pay();

        System.out.println("Finished the code execution");
    }
}
