package com.learnJava.methodReference;

import java.util.function.Function;

public class FunctionMethodReference {
    static Function<String, String> toUpperCaseFI = String::toUpperCase;
    public static void main(String[] args) {
        System.out.println(toUpperCaseFI.apply("wordle"));
    }
}
