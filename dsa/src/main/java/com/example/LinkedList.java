package com.example;

public class LinkedList {
    public class Node {
        int data;
        Node nextNode;

        public Node(int value) {
            data = value;
            nextNode = null;
        }
    }

    Node head;

    public LinkedList() {
        this.head = null;
    }

    public void insert(int value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
            return;
        }

        Node iterator = head;

        while (iterator.nextNode != null) {
            iterator = iterator.nextNode;
        }
        iterator.nextNode = newNode;
    }

    public void delete(int value) {
        if (head == null) {
            return;
        }

        if (head.data == value) {
            head = head.nextNode; // Move the head to the next node
            return;
        }

        Node currentNode = head;
        Node prevNode = null;

        while (currentNode != null && currentNode.data != value){
            prevNode = currentNode;
            currentNode = currentNode.nextNode;
        }

        if(currentNode == null){
            return;
        }


    }

    public void print() {
        if (head == null)
            return;

        Node iteratorNode = head;

        while (iteratorNode != null) {
            System.out.println("Element -> " + iteratorNode.data);
            iteratorNode = iteratorNode.nextNode;
        }
    }

}
