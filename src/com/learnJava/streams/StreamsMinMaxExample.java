package com.learnJava.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsMinMaxExample {

    private static Optional<Integer> findMaxValue(List<Integer> integerList){
        return integerList.stream().reduce(Integer::max);
        //return integerList.stream().reduce(0, (x,y) -> (x> y) ? x:y);
    }

    private static Optional<Integer> findMinValue(List<Integer> integerList){
        return integerList.stream().reduce(Integer::min);
    }
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(6, 7, 8, 9, 10);
        List<Integer> newIntegerList = new ArrayList<>();
        if(findMaxValue(newIntegerList).isPresent()){
            System.out.println(findMaxValue(newIntegerList).get());
        }

        if(findMinValue(integerList).isPresent()){
            System.out.println("Minimum value is "  + findMinValue(integerList).get());
        }else
        {
            System.out.println("List is empty");
        }
    }
}
