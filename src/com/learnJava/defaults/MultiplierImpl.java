package com.learnJava.defaults;

import java.util.List;

public class MultiplierImpl implements Multiplier{

    @Override
    public int multiply(List<Integer> integerList) {
        return integerList.stream().reduce(1, (a,b) -> a*b);
    }

    public int size(List<Integer> integerList){
        System.out.println("Inside multiplier class");
        return integerList.size();
    }
}
