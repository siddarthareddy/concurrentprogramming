package com.sid.blockingqueue;

public class DemoTask implements Runnable {
    private String name = null;

    public DemoTask(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Executed by " + Thread.currentThread().getName());
    }
}