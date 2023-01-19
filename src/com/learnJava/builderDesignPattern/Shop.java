package com.learnJava.builderDesignPattern;

public class Shop {
    public static void main(String[] args) {
        Phone p = new PhoneBuilder().setOs("IOS").setRam(8).getPhone();
        System.out.println(p);
    }
}
