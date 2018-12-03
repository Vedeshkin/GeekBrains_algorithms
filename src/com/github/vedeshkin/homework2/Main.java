package com.github.vedeshkin.homework2;


/**
 * Created by Vedeshkin on 12/3/2018.
 * All right reserved.
 */
public class Main {

    public static void main(String[] args) {

        MyStack<Integer> stack = new MyStack<>();
        MyQueue<Integer> queue = new MyQueue<>();
        MyDeque<Integer> deque = new MyDeque<>();
        stack.push(0);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(12);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack);
        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        queue.insert(4);
        queue.insert(5);
        queue.insert(6);

        System.out.println(queue.peek());
        System.out.println(queue.peek());

        queue.delete();

        System.out.println(queue);

        deque.insertLeft(1);
        deque.insertLeft(2);
        deque.insertLeft(3);
        deque.insertRight(4);
        deque.insertRight(5);
        deque.insertRight(6);
        System.out.println(deque);


    }

}
