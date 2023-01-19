package com.learnJava.observerDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Channel {
    private List<Subscriber> subscriberList = new ArrayList<>();
    private String title;

    public void subscribe(Subscriber subscriber){
        subscriberList.add(subscriber);
    }

    public void unsubscribe(Subscriber subscriber){
        subscriberList.remove(subscriber);
    }

    public void notifySubscriber(){
        for(Subscriber sub : subscriberList){
            sub.update();
        }
    }

    public void upload(String title){
        this.title = title;
    }
}
