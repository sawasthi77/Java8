package com.learnJava.optional;

import java.util.Optional;

public class OptionalPresentExample {

    public static void main(String[] args) {
        Optional<String> stringOptional = Optional.ofNullable("Hey Sam!!");
        if(stringOptional.isPresent()){
            System.out.println(stringOptional.get());
        }

        stringOptional.ifPresent(s -> System.out.println(s.toUpperCase()));
    }
}
