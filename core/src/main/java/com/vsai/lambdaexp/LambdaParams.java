package com.vsai.lambdaexp;

// create an functional interface
@FunctionalInterface
interface MyLambdaI{
    // define only one abstract method
    int add(int a, int b);
}

/*
 option 1: implement instance using dedicated class
class MyC implements MyLambdaI{
    @Override
    public int add(int a, int b){
        return a + b;
    }
}
*/

public class LambdaParams {
    public static void main(String[] args) {
        // ! creating instance with interface reference
        //MyLambdaI my = new MyC();

        // ! creating inner class -> interface_object() {inner_class}
        /*
            MyLambdaI my = new MyLambdaI() {
                @Override
                public int add(int a, int b) {
                    return a+b;
                }
            };
        */

        // ! creating lambda expression
        // note: we can remove the types in (..) and remove the return keyword, its already known.

        MyLambdaI my = (int a, int b) -> a + b;
        //MyLambdaI my = (int a, int b) -> {return a + b;};

        int result = my.add(1,2);
        System.out.println("result: "+result);
    }
}
