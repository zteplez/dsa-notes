package com.example;

class Stack {
    int[] stackArray;
    int currentIndex;

    public Stack(int size){
        stackArray = new int[size];
        currentIndex = 0;
    }
    public boolean isEmpty(){
        return currentIndex == 0 ? true : false;
    }
    public boolean isFull(){
        return currentIndex == stackArray.length;
    }
    public void destroy(){
        stackArray = null;
        currentIndex = 0;
    }
    public void push(int val){
        if (this.isFull()) {
            System.out.println("Stack is full.");
            return;
        }

        stackArray[currentIndex] = val;
        currentIndex++;
    }
    public int pop(){
        if (this.isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        }

        currentIndex--; 
        int val = stackArray[currentIndex];
        stackArray[currentIndex] = 0;  
        return val;
    }
    public void print(){
        for (int i : stackArray) {
            System.out.println("Element -> " + i);
        }
    }

    
}