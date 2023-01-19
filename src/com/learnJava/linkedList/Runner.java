package com.learnJava.linkedList;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Runner {
    public static void main(String[] args) {
        //LinkedList list = new LinkedList();
//        list.add(2);
//        list.add(1,5);
//        list.size();

//        LinkedListExample linkedListExample = new LinkedListExample();
//        linkedListExample.insert(5);

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.addAll(List.of(1,2,3,4,5));
        List<Integer> out = linkedList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(out);

    }
}
