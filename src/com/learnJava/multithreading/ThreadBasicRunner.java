package com.learnJava.multithreading;

public class ThreadBasicRunner {
    public static void main(String[] args) throws InterruptedException {
        //Task1
        System.out.println("Task1 Kicked off");
        Task1 task1 = new Task1();
        task1.start();

        //Task2
        System.out.println("Task2 kicked off ");
        Task2 task2 = new Task2();
        Thread task2Thread = new Thread(task2);
        task2Thread.start();


        task1.join();
        task2Thread.join();
        //Task3
        System.out.println("Task3 kicked off ");
        for(int i =301; i<=399; i++){
            System.out.print(i + " ");
        }
        System.out.println("\nTask 3 is done");
        System.out.println("Main is done");
    }
}

class Task1 extends Thread{
    public void run(){
        //Task1
        System.out.println("Task1 has started");
        for(int i =101; i<=199; i++){
            System.out.print(i + " ");
        }
        System.out.println("\nTask 1 is done");
    }
}

class Task2 implements Runnable{

    @Override
    public void run() {
        System.out.println("Task2 has started");
        for(int i =201; i<=299; i++){
            System.out.print(i + " ");
        }
        System.out.println("\nTask 2 is done");
    }
}
