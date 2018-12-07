package com.github.vedeshkin.homework3;


import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Created by Vedeshkin on 12/6/2018.
 * All right reserved.
 */
public class MyLinkedList<Item> implements Iterable {

    private int size = 0;
    private Node first = null;
    private Node last = null;

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void add(Item item) {
        Node prevFirst = first;
        first = new Node(item, null);
        if (isEmpty()) {
            last = first;
        } else {
            prevFirst.setNext(first);
        }
        size++;
    }

    public void remove(Item item) {
        if (isContain(item)) {
            unlink(item);
        }

    }

    private void unlink(Item item) {
        Node current = last;
        while (current != null) {
            Node next = current.getNext();
            if (next.getItem().equals(item)) {
                current.setNext(next.getNext());
                next.setNext(null);
                return;
            }

            current = current.getNext();
        }
    }


    private boolean isContain(Item item) {
        Node next = last;

        while (next != null) {
            if (next.getItem().equals(item)) {
                return true;
            }
            next = next.getNext();
        }
        return false;
    }


    @Override
    public Iterator<Item> iterator() {
        return new myIterator();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node current = last;
        while (current != null) {
            sb.append(current.getItem()).append(" ");
            current = current.getNext();
        }
        return String.format("MyLinkedList{ %s}", sb.toString());
    }


    private class Node {


        private Item item;
        private Node next;

        public Node(Item item, Node next) {
            this.item = item;
            this.next = next;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public Item getItem() {
            return item;
        }
    }

    private class myIterator implements Iterator<Item> {
        private Node current = last;

        @Override
        public boolean hasNext() {

            return current  != null;

        }

        @Override
        public Item next() {
            if(!hasNext()){
                throw new NoSuchElementException("No elements left in the list");
            }
            Item item = current.getItem();
            current = current.getNext();
            return item;
        }

    }
}
