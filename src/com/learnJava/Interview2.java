package com.learnJava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Interview2 {
    public static void main(String args[]){
        String str = "Java";
        //find out repeated char using stream apis

        //{1,2,3,4,6} output shud be 5
        List<Integer> integerList = new ArrayList<>(List.of(1,2,3,4,6));
        integerList.stream().sorted().forEach(i -> System.out.println(i));

        List<Character> characterList = new ArrayList<>(List.of('j','a','v','a'));
        characterList.stream().sorted().forEach(i -> characterList.contains(i));
    }
}
