package com.learnJava.multithreading;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultipleCallableRunner {

    public static void main(String[] args) throws ExecutionException,InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(1);

        List<CallableClass> callableClassList= List.of(new CallableClass("Jack"), new CallableClass("Jill"),
                new CallableClass("Walter"));

        List<Future<String>> results =
                executorService.invokeAll(callableClassList);

        for(Future<String> future: results){
            System.out.println(future.get());
        }
        executorService.shutdown();
    }
}
