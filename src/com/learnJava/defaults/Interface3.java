package com.learnJava.defaults;

public interface Interface3 extends Interface2 {
    default void methodC(){
        System.out.println("methodC");
    }
    default void methodB(){
        System.out.println("methodB" + Interface3.class);
    }
}
