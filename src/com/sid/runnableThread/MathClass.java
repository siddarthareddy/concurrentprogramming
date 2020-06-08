package com.sid.runnableThread;

public class MathClass {
    private final Object lock = new Object();
    void printNumbers(int n) throws InterruptedException {
//        synchronized (lock) {
            for (int i = 1; i <= n; i++)
            {
                System.out.println(Thread.currentThread().getName() + " :: "+  i);
                Thread.sleep(0);
            }
//        }
    }
}