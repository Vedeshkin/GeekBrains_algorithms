package com.github.vedeshkin.homework2;

import java.util.NoSuchElementException;

/**
 * Created by Vedeshkin on 12/3/2018.
 * All right reserved.
 */

public class MyQueue<T>{
    private Node<T> first, last;
    private int n;

    public MyQueue() {
        first = null;
        last = null;
        n = 0;
    }

    private boolean isEmpty() {
        return first == null;
    }

    public int size() {
        return n;
    }

    public T peek() {
        if (isEmpty()) throw new NoSuchElementException("Queue is empty");
        return first.item;
    }

    public void insert(T t) {
        Node<T> oldlast = last;
        last = new Node<T>();
        last.item = t;
        last.next = null;
        if (isEmpty()) {
            first = last;
        } else {
            oldlast.next = last;
        }
        n++;
    }

    public T delete() {
        if (isEmpty()) throw new NoSuchElementException("Queue is empty");
        T item = first.item;
        first = first.next;
        n--;
        if (isEmpty()) last = null;
        return item;
    }


    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        Node node = first;
        while(node != null) {
            s.append(node.item);
            s.append(' ');
            node = node.next;
        }
        return s.toString();
    }

    private static class Node<T> {
        private T item;
        private Node<T> next;
    }




}
