package Core.OOPSTopic.InnerClassTopic;

class Outer {
    int x = 10;

    void outerDisplay() {
        Inner inn = new Inner();
        System.out.println("printing y from outer class : " + inn.y);
        inn.innerDisplay();
    }

    class Inner {
        int y = 20;

        void innerDisplay() {
            System.out.println("printing x from inner class : " + x);
            System.out.println("printing y from inner class : " + y);
        }
    }
}

public class InnerClassIntroduction {
    public static void main(String[] args) {
        // calling the Outer class through an object
        Outer outerc = new Outer();
        outerc.outerDisplay();

        // to access the inner class, we first create an outer class object, then bind it to the inner class
        Outer.Inner oi = new Outer().new Inner();
        oi.innerDisplay();
    }
}
