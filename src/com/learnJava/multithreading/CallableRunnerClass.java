package com.learnJava.multithreading;

import java.util.concurrent.*;

class CallableClass implements Callable<String> {
    private String name;

    public CallableClass(String name){
        this.name = name;
    }
    @Override
    public String call() throws Exception {
        //Thread.sleep(1000);
        return "Hello " + name;
    }
}

public class CallableRunnerClass {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Future<String> stringFuture = executorService.submit(new CallableClass("Saumya"));
        System.out.println(stringFuture.get());
        executorService.shutdown();
    }
}
