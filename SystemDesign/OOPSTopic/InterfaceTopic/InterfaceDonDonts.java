package Core.OOPSTopic.InterfaceTopic;

interface Test {
    // variables in the interface are defaulted to static and final
    int x = 5;

    // generally an interface only has abstract methods, but to have concrete methods they should be static
    static void meth3() {
        System.out.println("meth3 from Test Interface");
    }

    void meth1();

    void meth2();
}

// interfaces can be extended
interface Test3 extends Test1 {
    void meth4();
}

class My implements Test3 {
    public void meth1() {
    }

    public void meth2() {
    }

    public void meth4() {
    }
}

public class InterfaceDonDonts {
    public static void main(String[] args) {
        System.out.println(Test.x);
        Test.meth3();
    }
}
