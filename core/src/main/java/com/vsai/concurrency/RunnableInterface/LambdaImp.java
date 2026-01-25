package com.vsai.concurrency.RunnableInterface;

public class LambdaImp {
    public static void main(String[] args) {
        // directly we can create instances of the "Runnable" Functional Interface and pass to the Thread constructor.

        // 1. creating runnable interface instances
        Runnable r1 = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("runner 1: " + i);
            }
        };

        Runnable r2 = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("runner 1: " + i);
            }
        };


        // 2. creating new threads with runnable instances
        var t1 = new Thread(r1);
        var t2 = new Thread(r2);

        // 3. starting threads
        t1.start();
        t2.start();

    }
}
