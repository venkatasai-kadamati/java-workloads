package Core.AnnotationsTopic;

//Example to understand @Override annotation

/*
Why use @Override builtin annotation?
    1. The key is that when overriding we might encounter spelling mistakes like instead of "display" I can have a typo "displya".
    2. Here the compiler doesn't know the intent, whether we are trying to override or just create a new method called "displya".
*/
abstract class Parent {
    abstract public void display();
}

class Child extends Parent {
    @Override
    public void display() {
        System.out.println("Child over-rides the parent display method");
    }
}

// Example to understand @Deprecated annotation
class OldClass {

}

public class AnnoDemo {
    static void main() {
        Child ch = new Child();
        ch.display();
    }
}
