package com.vsai.lambdaexp;

interface MyLambdaRf{
    void display(String str);
}


// ? Idea: The goal is to override interface's abstract method with existing method. This is done using method reference. when we say String.toUpperCase() and try to print display() we are internally running pre-existing toUpperCase() method.
public class LambdaMethodRef {

    // constructor
    public LambdaMethodRef(String s){
        System.out.println(s.toUpperCase());
    }

    public static void main(String[] args) {
        // we are simply saying that "hi display method(), assume the behaviour/output of println"
        // System.out -> Class.object
        // ::println -> ::(scope resolution) println is the static method
        // so now our interface has its method overridden and we can use it.

        // ! basic method referencing
        //MyLambdaRf ml = System.out::println;
        //ml.display("hi, done using method referencing");

        // ! using example (better understanding)
        //MyLambdaRf ml = LambdaMethodRef::reverse;
        //ml.display("hi, done using method referencing");

        // ! method reference of a constructor of class
        MyLambdaRf ml = LambdaMethodRef::new;
        ml.display("method reference of constructor");
    }

    public static void reverse(String str){
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        System.out.println(sb);
    }
}
