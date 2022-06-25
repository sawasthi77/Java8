package com.learnJava.parallelStream;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class ParallelStreamExample {

    private static long checkPerformanceResult(Supplier<Integer> integerSupplier, int noOfTimes){
        long startTime = System.currentTimeMillis();
        for(int i = 0; i < noOfTimes; i++){
             integerSupplier.get();
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    private static int sumSequentialStream(){
        return IntStream.rangeClosed(1, 100000).sum();
    }

    private static int sumParallelStream(){
        return IntStream.rangeClosed(1, 100000 ).parallel().sum();
    }
    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors() );
        System.out.println("Sequential stream result " + checkPerformanceResult(ParallelStreamExample::sumSequentialStream, 20));
        System.out.println("Parallel Stream Result " + checkPerformanceResult(ParallelStreamExample::sumParallelStream, 20));
    }
}
