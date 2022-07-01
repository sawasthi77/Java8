package com.learnJava.defaults;

import java.util.List;

public interface Multiplier {
    int multiply(List<Integer> integerList);

    // They can be over-ridden
    default int size(List<Integer> integerList){
        return integerList.size();
    }

    // They cannot be over-ridden
    static boolean notEmpty(List<Integer> integerList){
        return integerList != null && integerList.size() != 0;
    }
}
