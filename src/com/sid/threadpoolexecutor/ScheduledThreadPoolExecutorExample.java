package com.sid.threadpoolexecutor;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPoolExecutorExample
{
    public static void main(String[] args)
    {
        ScheduledThreadPoolExecutor executor = (ScheduledThreadPoolExecutor) Executors.newScheduledThreadPool(10);

        Task1 task = new Task1("Repeat Task");
        System.out.println("Created : " + task.getName());

        executor.scheduleWithFixedDelay(task, 2, 3, TimeUnit.SECONDS);
    }
}

class Task1 implements Runnable {
    private String name;

    public Task1(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void run() {
        System.out.println("Executing : " + name + ", Current Seconds : " + new Date().getSeconds() + " by " + Thread.currentThread().getName());
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}