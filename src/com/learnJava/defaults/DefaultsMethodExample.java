package com.learnJava.defaults;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DefaultsMethodExample {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Sam", "Jenny", "Alex", "Mike", "Eric");
        //Collections.sort(stringList);
        System.out.println("Sorted list using collections.sort" + stringList);

        //Java 8 approach
        stringList.sort(Comparator.naturalOrder());
        System.out.println("Sorted list using list sort " + stringList);
    }
}
