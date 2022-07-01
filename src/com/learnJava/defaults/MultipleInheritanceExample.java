package com.learnJava.defaults;

public class MultipleInheritanceExample implements Interface1, Interface2, Interface3{

    public void methodA(){
        System.out.println("client123");
    }
    // Resolving the conflicts of multiple inheritance in Java 8
    // 1> class that implements interface
    // 2> sub interface that extends the interface

    public static void main(String[] args) {
        MultipleInheritanceExample multipleInheritanceExample = new MultipleInheritanceExample();
        multipleInheritanceExample.methodA();
        multipleInheritanceExample.methodB();
        multipleInheritanceExample.methodC();
    }
}
