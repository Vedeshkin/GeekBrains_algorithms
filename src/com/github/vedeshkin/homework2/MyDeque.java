package com.github.vedeshkin.homework2;

import java.util.NoSuchElementException;

/**
 * Created by vedeshkin on 04.12.2018.
 */
public class MyDeque<T> {

    private Node<T> head, tail;
    private int size = 0;

    public MyDeque() {
    }

    int size() {
        return size;
    }

    boolean isEmpty() {
        return (size() == 0);
    }


    public void insertRight(T item) {
        Node<T> prevHead = head;
        Node<T> newHead = new Node<T>(item);
        if (prevHead != null) {
            newHead.addToRight(prevHead);
        } else {
            tail = newHead;
        }
        head = newHead;
        size++;
    }

    public void insertLeft(T item) {
        Node<T> newTail = new Node<T>(item);
        Node<T> prevTail = tail;
        if (prevTail != null) {
            prevTail.addToRight(newTail);
        } else {
            head = newTail;
        }
        tail = newTail;
        size++;
    }

    public T removeRight() {
        if (isEmpty()) {
            throw new NoSuchElementException("Deque is empty");
        }
        size--;
        Node<T> prevHead = head;
        head = prevHead.right;
        prevHead.right = null;
        if (head != null) {
            head.left = null;
        }
        return prevHead.item;
    }

    public T removeLeft() {
        if (isEmpty()) {
            throw new NoSuchElementException("Deque is empty");
        }
        size--;
        Node<T> prevTail = tail;
        tail = prevTail.left;
        prevTail.left = null;
        if (tail != null) tail.right = null;
        return prevTail.item;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        Node node = tail;
        while (node != null) {
            s.append(node.item);
            s.append(' ');
            node = node.left;
        }
        return s.toString();
    }


    private class Node<T> {
        Node<T> left, right;
        private final T item;

        Node(T item) {
            this.item = item;
        }

        void addToRight(Node<T> other) {
            this.right = other;
            other.left = this;
        }
    }
}
