package com.learnJava.coreJava;

public class EqualsFundamentals {
    public static void main(String[] args) {

    }
}

class Person{
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if( o == null || getClass() != getClass()) return false;
        Person that = (Person) o;
        return firstName.equals(that.firstName) && lastName.equals(that.lastName);
    }
}
