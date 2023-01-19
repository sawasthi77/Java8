package com.learnJava.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task extends Thread{
    private int number;

    public Task(int num){
        this.number = num;
    }

    @Override
    public void run() {
        System.out.println(String.format("Task %d has started", number));
        for(int i = number*100;i <= number*100 + 99; i++){
            System.out.print(i + " ");
        }
        System.out.println(String.format("\n Task %d is done", number));
    }
}

public class ExecutorServiceClass {
    public static void main(String[] args) {
        //ExecutorService executorService = Executors.newSingleThreadExecutor();
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        executorService.execute(new Task(1));
        executorService.execute(new Task(2));
        executorService.execute(new Task(3));
        executorService.execute(new Task(4));

        executorService.shutdown();
    }
}
