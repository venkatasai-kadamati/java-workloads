package com.vsai.lambdaexp;

// by default methods in interface are: public & abstract
@FunctionalInterface
interface MyLambda{
    void display();
}

class My implements MyLambda{
    @Override
    public void display(){
        System.out.println("high quality display");
    }
}


// if an interface has just one abstract method, then its called as a functional interface.
// we denote this by using @FunctionalInterface annotation
public class LambdaIntro {
    public static void main(String[] args) {
        // used for defining anonymous functions (nameless)
        // lambda expressions are defined using interfaces
        // since we are implementing MyLambda Interface, we can directly create reference to the interface instead of class.

        // ! using dedicated class that implement interface
        //MyLambda m = new My(); // but for this to work we need to create a class dedicatedly that implements our interface. To avoid this we can have a inner class doing the same.

        // ! using nameless inner class
        // inner class -> class obj = new class(){ inner }
        //MyLambda m = new MyLambda() {
        //    // inner class
        //    @Override
        //    public void display() {
        //        System.out.println("inner class: display");
        //    }
        //};

        // ! using lambda expression
        // to covert the above into lambda, just remove the new class() & method name
        // we can safely remove the method name as we know that this interface only has one display() method.
        MyLambda m = () -> System.out.println("lambda exp: display");
        m.display();
    }
}
