package com.vsai.lambdaexp;

interface MyLambdaEx{
    void display();
}

// demo class to understand what lambda can access and modify .. like instance, local, outside method variables.
/*
    - instance variable: can access and modify
    - method variable (outside local variables): can access but can't modify
    - local variable: can access and modify
 */
class Demo{
    // instance variable can be accessed and modified in our lambda's
    int instanceVar = 0;

    public void method1(){
        // any local variable outside lambda's should either be final or unchanging.
        final int countFromOutside = 0;

        MyLambdaEx ml = () -> {
            // lambda's can hold multiple statements
            // they can have local variables also
            //int countFromInside = 0;
            System.out.println("Hi");
            // System.out.println("Bye" + countFromOutside);
            System.out.println("Bye " + instanceVar);
        };

        ml.display();
    }
}

// class to understand how pass lambda's as method parameter.
class UseLambda{
    public void callLambda(MyLambdaEx ml){
        ml.display();
    }
}
public class LambdaCapture {
    public static void main(String[] args) {
        // answer fundamental questions like
        // can lambda's have local variables and can they access local variables
        // can we pass lambda exp as parameters

        Demo d = new Demo();
        d.method1();

        UseLambda usl = new UseLambda();
        usl.callLambda(() -> System.out.println("passed lambda as method param"));
    }
}
