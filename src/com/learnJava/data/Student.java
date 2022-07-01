package com.learnJava.data;

import javax.crypto.spec.OAEPParameterSpec;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Student {
    private String name;
    private int gradLevel;
    private String gender;
    private double gpa;
    private int notebooks;
    private Optional<Bike> bike = Optional.empty();

    public Optional<Bike> getBike() {
        return bike;
    }

    public void setBike(Optional<Bike> bike) {
        this.bike = bike;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gradLevel=" + gradLevel +
                ", gender='" + gender + '\'' +
                ", gpa=" + gpa +
                ", notebooks=" + notebooks +
                ", bike=" + bike +
                ", activities=" + activities +
                '}';
    }

    public Student(String name, int gradLevel, String gender, double gpa, int notebooks, List<String> activities) {
        this.name = name;
        this.gradLevel = gradLevel;
        this.gender = gender;
        this.gpa = gpa;
        this.notebooks = notebooks;
        this.activities = activities;
    }

    public Student(String name, int gradLevel, String gender, double gpa, List<String> activities) {
        this.name = name;
        this.gradLevel = gradLevel;
        this.gender = gender;
        this.gpa = gpa;
        this.activities = activities;
    }

    public Student() {

    }

    public Student(String s) {
        this.name = s;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGradLevel() {
        return gradLevel;
    }

    public void setGradLevel(int gradLevel) {
        this.gradLevel = gradLevel;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public int getNotebooks() {
        return notebooks;
    }

    public void setNotebooks(int notebooks) {
        this.notebooks = notebooks;
    }

    public void printActivities(){
        System.out.println(activities);
    }

    List<String> activities = new ArrayList<>();

    public List<String> getActivities() {
        return activities;
    }

    public void setActivities(List<String> activities) {
        this.activities = activities;
    }

}
