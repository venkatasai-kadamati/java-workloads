package Core.OOPSTopic.AbstractClassesTopic;

public class Introduction {

    // Super class can't be instantiated as it is an abstract class, and they can't have objects
    //    Super s1 = new Super();
    public static void main(String[] args) {
        Sub sub1 = new Sub();
        sub1.method1();
        sub1.method2();
    }
}

abstract class Super {
    Super() {
        System.out.println("Super");
    }

    void method1() {
        System.out.println("Super Method 1");
    }

    abstract void method2();
}

class Sub extends Super {
    void method2() {
        System.out.println("Sub Method 1");
    }
}
