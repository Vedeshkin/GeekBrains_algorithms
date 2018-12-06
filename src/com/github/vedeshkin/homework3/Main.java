package com.github.vedeshkin.homework3;

import java.util.Iterator;

/**
 * Created by Vedeshkin on 12/6/2018.
 * All right reserved.
 */
public class Main {

    public static void main(String[] args) {
        MyLinkedList<Integer> linkedList = new MyLinkedList<>();
        MyListBasedStack<String> stack = new MyListBasedStack<>();
        MyListBasedQueue<Integer> queue = new MyListBasedQueue<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.remove(2);
        System.out.println(linkedList);
        Iterator  it = linkedList.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        stack.push("1");
        stack.push("2");
        stack.push("3");
        stack.push("4");
        stack.push("5");
        stack.pop();
        stack.pop();
        System.out.println(stack.peek());
        System.out.println(stack);


        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.poll();
        System.out.println(queue.peek());
        System.out.println(queue);


    }




}
