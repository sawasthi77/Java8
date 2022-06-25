package com.learnJava.lambdas;

public class RunnableLambdaExample {
    public static void main(String[] args) {
        /**
         * prior to java 8
         */
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Runnable 1");
            }
        };
        new Thread(runnable).start();

        //java 8 lambda

        // syntax is very simple
        Runnable runnableLambda = () -> {
            System.out.println("Inside runnable 2");
        };

        new Thread(runnableLambda).start();
    }
}
