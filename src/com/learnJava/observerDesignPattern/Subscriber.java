package com.learnJava.observerDesignPattern;

public class Subscriber {

    private  String name;
    private Channel channel = new Channel();

    public void update(){
        System.out.println("Video uploaded");
    }

    public Subscriber(String name) {
        this.name = name;
    }

    public void subscribeChannel(Channel ch){
        channel = ch;
    }
}
