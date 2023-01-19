package com.learnJava.concurrency;

public class ConcurrencyRunner {

    public static void main(String[] args) {

        Counter counter = new Counter();
        counter.increment();
        System.out.println(counter.getI());
    }
}
