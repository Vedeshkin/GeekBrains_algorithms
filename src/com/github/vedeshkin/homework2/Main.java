package com.github.vedeshkin.homework2;

/**
 * Created by Vedeshkin on 12/3/2018.
 * All right reserved.
 */
public class Main {

    public static void main(String[] args) {

        MyStack<Integer> stack = new MyStack<>();
        stack.push(0);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.push(9);
        stack.push(10);
        stack.push(12);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack);



    }

}
