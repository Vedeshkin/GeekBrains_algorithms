package com.github.vedeshkin.homework3;

import java.util.LinkedList;

/**
 * Created by Vedeshkin on 12/6/2018.
 * All right reserved.
 */
public class MyListBasedStack<Item> {
    private LinkedList list;

    public MyListBasedStack(){
        list = new LinkedList<Item>();
    }

    public void push(Item item){
        list.addFirst(item);
    }
    public Item pop(){
        return (Item)list.remove();
    }

    public Item peek(){
        return (Item)list.getFirst();
    }

    @Override
    public String toString() {
       return list.toString();
    }
}
