package BackendSpring.BuildSystems;

import BackendSpring.BuildSystems.Implementation.Helper;

public class Main {
    public static void main(String[] args) {
        System.out.println("We are printing since we wish to compile");
        Helper helper = new Helper();
        Helper.getStringOutput();
    }
}
