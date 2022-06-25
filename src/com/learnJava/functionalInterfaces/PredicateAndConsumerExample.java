package com.learnJava.functionalInterfaces;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDatabase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateAndConsumerExample {
    Predicate<Student> p1 = (student) -> student.getGradLevel() > 1;
    Predicate<Student> p2 = (student) -> student.getGpa() > 8;

    BiPredicate<Integer, Double> biPredicate = (grade, gpa) -> grade > 1 && gpa > 8.0;

    BiConsumer<String, List<String>> biConsumer = (name, activities) -> System.out.println(name  + ":"+ activities);

    Consumer<Student> c1 = (student) -> {
        if(biPredicate.test(student.getGradLevel(), student.getGpa())){
            biConsumer.accept(student.getName(), student.getActivities());
        }
    };

    private void printNameAndActivities(List<Student> studentList){
        studentList.forEach(student -> c1.accept(student));
    }

    public static void main(String[] args) {
      new PredicateAndConsumerExample().printNameAndActivities(StudentDatabase.getAllStudents());
    }
}
