package com.learnJava.functionalInterfaces;

import java.util.function.UnaryOperator;
// when ever we have input and output of the same type then we do not even make use of the fucntion
public class UnaryOperatorExample {
    static UnaryOperator<String> unaryOperator = (s) -> s.concat("default");
    public static void main(String[] args) {
        System.out.println(unaryOperator.apply("Sam "));
    }
}
