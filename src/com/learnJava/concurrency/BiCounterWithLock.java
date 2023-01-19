package com.learnJava.concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BiCounterWithLock {
    private int i = 0;
    private int j = 0;

    Lock lockForI = new ReentrantLock();
    Lock lockForJ = new ReentrantLock();

    synchronized public void incrementI(){
        //Get Lock
        lockForI.lock();
        i++;
        lockForI.unlock();
        //Release Lock
    }

    public int getI() {
        return i;
    }

    synchronized public void incrementJ(){
        //Get lock
        lockForJ.lock();
        j++;
        lockForJ.unlock();
        //Release lock
    }

    public int getJ() {
        return j;
    }
}
