package com.learnJava.functionalInterfaces;

import java.util.function.Predicate;

public class PredicateExample {
    static Predicate<Integer> p1 = (a) -> a % 2 == 0;
    static Predicate<Integer> p2 = (a) -> a % 5 == 0;

    private static void predicateAnd(){
        System.out.println("Use of predicate chaining with AND " + p1.and(p2).test(9));
    }
    private static void predicateOr() {
        System.out.println("Use of predicate chaining with OR " + p1.or(p2).test(8));
    }
    private static void predicateNegate() {
        System.out.println("Use of predicate chaining with NEGATE " + p1.or(p2).negate().test(8));
    }
    public static void main(String[] args) {
        predicateNegate();
        //System.out.println(p1.test(2)) ;
    }
}
