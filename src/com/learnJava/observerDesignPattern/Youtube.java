package com.learnJava.observerDesignPattern;

public class Youtube {
    public static void main(String[] args) {
        Channel channel = new Channel();
        Subscriber s1 = new Subscriber("Saumya");
        Subscriber s2 = new Subscriber("Neha");
        Subscriber s3 = new Subscriber("Shruti");

        channel.subscribe(s1);
        channel.subscribe(s2);
        channel.subscribe(s3);

        channel.notifySubscriber();

        s1.subscribeChannel(channel);
        s2.subscribeChannel(channel);
        s3.subscribeChannel(channel);

        channel.upload("Observer DP");
    }
}
