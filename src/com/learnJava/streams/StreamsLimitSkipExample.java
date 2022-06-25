package com.learnJava.streams;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsLimitSkipExample {

    private static Optional<Integer> limitSum(List<Integer> integerList){
        return integerList.stream().limit(3).reduce(Integer::sum);
    }

    private static Optional<Integer> skipSum(List<Integer> integerList){
        return integerList.stream().skip(3)
                .reduce(Integer::sum);
    }
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(6,7,8,9,10);
        Optional<Integer> limitResult = limitSum(integerList);
        if(limitResult.isPresent()){
            System.out.println("Sum of first 2 elements is " + limitResult.get());
        }
        else{
            System.out.println("There are no elements passed");
        }
        Optional<Integer> skipSum = skipSum(integerList);
        if(skipSum.isPresent()){
            System.out.println(skipSum.get());
        }
    }
}
