package com.github.vedeshkin.homework3;

import java.util.LinkedList;

/**
 * Created by Vedeshkin on 12/6/2018.
 * All right reserved.
 */
public class MyListBasedQueue<Item> {
    private LinkedList list;

    public MyListBasedQueue() {
        list = new LinkedList<Item>();
    }

    public int size() {return  size();}
    public boolean isEmtpy() {return list.isEmpty();}
    public void offer (Item item){ list.addLast(item);}
    public Item peek(){return  (Item)list.getFirst();}
    public Item poll(){return  (Item)list.remove();}

    @Override
    public String toString() {
        return String.format("MyListBasedQueue{ %s }",list.toString());
    }
}
