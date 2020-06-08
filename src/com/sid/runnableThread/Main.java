package com.sid.runnableThread;

import com.sid.runnableThread.MathClass;

public class Main
{
    public static void main(String args[]) throws InterruptedException {
        final MathClass mathClass = new MathClass();

        mathClass.printNumbers(100);
        //first thread
        Runnable r = new Runnable() {
            public void run(){
                try {
                    mathClass.printNumbers(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        new Thread(r, "ONE").start();
        new Thread(r, "TWO").start();
    }
}