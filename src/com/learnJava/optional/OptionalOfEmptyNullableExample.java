package com.learnJava.optional;

import java.util.Optional;

public class OptionalOfEmptyNullableExample {
    private static Optional<String> ofNullable(){
        Optional<String> stringOptional = Optional.ofNullable("hello");
        return stringOptional;
    }

    private static Optional<String> of(){
        Optional<String> stringOptional = Optional.of("hello OF");
        return stringOptional;
    }

    private static Optional<String> empty(){
        return Optional.empty();
    }
    public static void main(String[] args) {
        System.out.println(of().get());
        System.out.println("empty " + empty());
    }
}
