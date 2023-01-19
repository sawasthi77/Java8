package com.learnJava.multithreading;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultipleAnyCallableRunner {
    public static void main(String[] args) throws ExecutionException,InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(1);

        List<CallableClass> callableClassList= List.of(new CallableClass("Jack"), new CallableClass("Jill"),
                new CallableClass("Walter"));

        String results =
                executorService.invokeAny(callableClassList);
            System.out.println(results);
        executorService.shutdown();
    }
}
