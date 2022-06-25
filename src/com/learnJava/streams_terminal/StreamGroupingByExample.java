package com.learnJava.streams_terminal;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDatabase;

import java.util.*;

import static java.util.stream.Collectors.*;

public class StreamGroupingByExample {
    private static void groupStudentByGender(){
        Map<String, List<Student>> groupedStudent =
                StudentDatabase.getAllStudents().stream().collect(groupingBy(Student::getGender));
        System.out.println(groupedStudent);
    }

    private static void customizedGroupStudent(){
        Map<String, List<Student>> groupedStudent =
                StudentDatabase.getAllStudents().stream()
                        .collect(groupingBy(student -> student.getGpa() >= 5 ? "outstanding":"average"));
        System.out.println(groupedStudent);
    }

    private static void twoLevelGrouping_1(){
        Map<Integer, Map<String, List<Student>>> twoLevelMapping = StudentDatabase.getAllStudents().stream()
                .collect(groupingBy(Student::getGradLevel,
                        groupingBy(student -> student.getGpa() >= 5 ? "outstanding":"average")));
        System.out.println(twoLevelMapping);
    }

    private static void twoLevelGrouping_2(){
        Map<String, Integer> twoLevelMapping = StudentDatabase.getAllStudents().stream()
                .collect(groupingBy(Student::getName, summingInt(Student::getNotebooks)));
        System.out.println(twoLevelMapping);
    }

    private static void threeLevelGrouping(){
        LinkedHashMap<String, Set<Student>> studentLinkedHashmap = StudentDatabase.getAllStudents().stream()
                .collect(groupingBy(Student::getName, LinkedHashMap::new, toSet()));
        System.out.println(studentLinkedHashmap);
    }

    private static void calculateTopGPA(){
        Map<Integer, Optional<Student>> topStudent = StudentDatabase.getAllStudents().stream()
                .collect(groupingBy(Student::getGradLevel, maxBy(Comparator.comparing(Student::getGpa))));
        //System.out.println(topStudent );

        Map<Integer, Student> topStudentName = StudentDatabase.getAllStudents().stream()
                .collect(groupingBy(Student::getGradLevel,
                        collectingAndThen(maxBy(Comparator.comparing(Student::getGpa)),Optional::get)));
        System.out.println(topStudentName);
    }

    private static void calculateLeastGPA(){
        Map<Integer, Optional<Student>> topStudent1 = StudentDatabase.getAllStudents().stream()
                .collect(groupingBy(Student::getGradLevel, minBy(Comparator.comparing(Student::getGpa))));
        //System.out.println(topStudent1 );

        Map<Integer, Student> topStudentName1 = StudentDatabase.getAllStudents().stream()
                .collect(groupingBy(Student::getGradLevel,
                        collectingAndThen(minBy(Comparator.comparing(Student::getGpa)),Optional::get)));
        System.out.println(topStudentName1);
    }
    public static void main(String[] args) {
        //groupStudentByGender();
        //customizedGroupStudent();
        //twoLevelGrouping_2();
        //threeLevelGrouping();
        //calculateTopGPA();
        calculateLeastGPA();
    }
}
