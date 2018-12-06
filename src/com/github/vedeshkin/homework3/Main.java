package com.github.vedeshkin.homework3;

import java.util.Iterator;

/**
 * Created by Vedeshkin on 12/6/2018.
 * All right reserved.
 */
public class Main {

    public static void main(String[] args) {
        MyLinkedList<Integer> linkedList = new MyLinkedList<>();
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
    }
}
