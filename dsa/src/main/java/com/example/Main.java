package com.example;

public class Main {
    public static void main(String[] args) {
        
    }

    public void testStack(){
        Stack stack = new Stack(5);
        stack.push(15);
        stack.push(25);
        stack.push(34);
        stack.push(22);
        stack.push(16);
        stack.print();
        stack.push(29);
        stack.pop();
        stack.print();
        stack.destroy();
    }
}