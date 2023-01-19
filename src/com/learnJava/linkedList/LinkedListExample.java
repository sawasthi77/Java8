package com.learnJava.linkedList;

public class LinkedListExample {
    Node headNode;

    public void insert(int data){
        Node node = new Node();
        node.data = data;
        node.next = null;

        if(node.next == null){
            headNode = node;
        }
        else{
            Node n = headNode;
        }
    }
}
