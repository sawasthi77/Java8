package com.learnJava.functionalInterfaces;

import java.util.function.Function;

public class FunctionExamples {

    static Function<String, String> function = (name) -> name.toUpperCase();

    static Function<String , String> addSomeString = (name) -> name.concat(" hey");

    public static void main(String[] args) {

        System.out.println(function.andThen(addSomeString).apply("sam")); // function chaining
        System.out.println(function.compose(addSomeString).apply("sam"));
        //System.out.println(addSomeString.andThen(function).apply("sam")); // this is same as compose function
    }
}
