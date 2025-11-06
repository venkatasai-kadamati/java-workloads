package Core.OOPSTopic.InterfaceTopic;

/*
    1. Interfaces have all abstract methods only, and thus no specific keyword mentioning is required saying "abstract"
    2. Interfaces when implemented by other classes must and should override all abstract methods from the interface else would be considered as an abstract class.
    3. We can't have objects for an interface, since they are vague
    4. A class can implement from various inheritances leading to multiple inheritance.
*/


/*
    Foundation: Reference Types vs Object Types
    1. Reference type: The type of the variable (e.g., Test1). It determines what methods and fields you can access at compile time.

    2. Object type: The actual class of the object in memory (e.g., Test2). It determines which implementation of a method is executed at runtime (polymorphism).

    -- A reference variable can only access members declared in its own type, regardless of the object's actual type. The object type determines the actual method implementation used when you call a method that exists in the reference type.
*/

interface Test1 {
    void meth1();

    void meth2();
}

class Test2 implements Test1 {
    public void meth1() {
        System.out.println("meth1 from Test2");
    }

    public void meth2() {
        System.out.println("meth2 from Test2");
    }

    public void meth3() {
        System.out.println("meth3 from Test2");
    }
}


public class Introduction {
    public static void main(String[] args) {
        Test1 t1 = new Test2();

        t1.meth1();
        t1.meth2();
//        t1.meth3();
    }
}