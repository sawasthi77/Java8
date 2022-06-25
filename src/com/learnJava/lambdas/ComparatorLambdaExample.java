package com.learnJava.lambdas;

import java.util.Comparator;

public class ComparatorLambdaExample {

    public static void main(String[] args) {
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };
        System.out.println("Result of legacy comparator is: "+
                comparator.compare(3,2));

        Comparator<Integer> comparatorLambda = ( a,b) ->
            a.compareTo(b);

        System.out.println("Result of lambda comparator is: " +
                comparatorLambda.compare(4,3));
    }
}
