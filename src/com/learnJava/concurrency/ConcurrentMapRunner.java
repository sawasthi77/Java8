package com.learnJava.concurrency;

import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.LongAdder;

public class ConcurrentMapRunner {
    public static void main(String[] args) {
//        Map<Character, LongAdder> occurances = new Hashtable<>();
//        String str = "ABCD ABCD ABCD";
//        for(char c: str.toCharArray()){
//            LongAdder longAdder = occurances.get(c);
//            if(longAdder == null){
//                longAdder = new LongAdder();
//            }
//            longAdder.increment();
//            occurances.put(c, longAdder);
//        }
//        System.out.println(occurances);
        ConcurrentMap<Character, LongAdder> occurances = new ConcurrentHashMap<>();
        String str = "ABCD ABCD ABCD";
        for(char ch: str.toCharArray()){
            occurances.computeIfAbsent(ch, c-> new LongAdder()).increment();
        }
        System.out.println(occurances);
    }
}
