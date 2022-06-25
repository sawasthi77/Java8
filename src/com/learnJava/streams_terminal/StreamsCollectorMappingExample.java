package com.learnJava.streams_terminal;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDatabase;

import java.util.List;
import java.util.Set;

import static java.util.stream.Collectors.*;

public class StreamsCollectorMappingExample {

    public static void main(String[] args) {
        List<String> namesList =
                StudentDatabase.getAllStudents().stream()
                        .collect(mapping(Student::getName, toList()));
        System.out.println(namesList);

        Set<String> namesSet =
                StudentDatabase.getAllStudents().stream()
                        .collect(mapping(Student::getName, toSet()));
        System.out.println(namesSet);
    }
}
