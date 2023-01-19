package com.learnJava.concurrency;

public class Counter {
    int i;

    synchronized public int getI() {
        return i;
        // i++ is not atomic
        // get the value of i, increment and set the value of i
        // that means it is not thread safe, so that multiple threads cannot work on the i++ operation as it is combination
        // of the above operations.
    }

    public void increment(){
        i ++;
    }
}
