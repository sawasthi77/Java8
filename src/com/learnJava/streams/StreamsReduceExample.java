package com.learnJava.streams;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDatabase;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsReduceExample {
    public static int performMultiplication(List<Integer> integerList){
        // reduce takes two parameters with first parameter as the default value
        // here a = 1(default value), b = 1(from stream) result is 1
        // a = 1(result), b = 2(from stream) result is 2
        return integerList.stream().reduce(1, (a, b) -> a*b );
    }

    private static Optional<Student> getHighestGPA(){
        return StudentDatabase.getAllStudents().stream()
                .reduce((s1, s2) -> (s1.getGpa() > s2.getGpa()) ? s1:s2);
    }
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 7, 9);
        System.out.println(performMultiplication(integerList));
        Optional<Student> studentOptional = getHighestGPA();
        if(studentOptional.isPresent()){
            System.out.println(studentOptional.get());
        }
    }
}
