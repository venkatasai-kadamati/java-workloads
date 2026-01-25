package com.vsai.concurrency.ThreadClass;
// we can directly extend the Thread class

class Runner1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("runner1: " + i);
        }
    }
}

class Runner2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("runner2: " + i);
        }
    }
}

public class ThreadCls {
    public static void main(String[] args) {
        // creating the instances of the threads
        Thread t1 = new Runner1();
        var t2 = new Runner2();

        t1.start();
        t2.start();
    }
}
