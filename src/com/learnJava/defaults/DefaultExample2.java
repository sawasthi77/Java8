package com.learnJava.defaults;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDatabase;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class DefaultExample2 {

    static  Consumer<Student> studentConsumer = (student -> System.out.println(student));
    static Comparator<Student> nameComparator =
            Comparator.comparing(Student::getName);
    static Comparator<Student> gradeComparator =
            Comparator.comparing(Student::getGradLevel);

    private static void sortByName(List<Student> studentList){
        System.out.println("After sort");
        Comparator<Student> nameComparator =
                Comparator.comparing(Student::getName);

        studentList.sort(nameComparator);
        studentList.forEach(studentConsumer );
    }

    private static void sortByGPA(List<Student> studentList){
        System.out.println("After sort");
        Comparator<Student> nameComparator =
                Comparator.comparingDouble(Student::getGpa);

        studentList.sort(nameComparator);
        studentList.forEach(studentConsumer );
    }

    private static void ComparatorChaining(List<Student> studentList){
        System.out.println("Comparator chaining");
        studentList.sort(gradeComparator.thenComparing(nameComparator));
        studentList.forEach(studentConsumer);
    }

    private static void sortWithNullValues(List<Student> studentList){
        System.out.println("Sort on the list with null values");
        Comparator<Student> studentComparator = Comparator.nullsLast(nameComparator);
        studentList.sort(studentComparator);
        studentList.forEach(studentConsumer);
    }

    public static void main(String[] args) {
        List<Student> studentList = StudentDatabase.getAllStudents();
        System.out.println("Before sort");
        studentList.forEach(studentConsumer);
        sortWithNullValues(studentList);
    }
}
