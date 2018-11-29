package com.github.vedeshkin.tasks;

import java.util.Random;

/**
 * Created by Vedeshkin on 11/29/2018.
 * All right reserved.
 */
public class MyArray{
    static  final int DATA_LENGHT = 1000000;
    private int [] data;

    public MyArray(int arraySize){
        this.data = new Random().ints(arraySize,0,9999999).toArray();
    }

    public void add(int value, int index){
        data[index] = value;
    }
    public void delete(int value){
        for (int i = 0; i <data.length;i++){
            if(data[i]== value ){
                data[i] =0;
            }
        }
    }


    public int search(int value){
        for (int i = 0; i <data.length;i++){
            if(data[i]== value ){
                return i;
            }
        }
        return  -1;
    }
    public void sort(Action sort){
        long start = System.currentTimeMillis();
        sort.performAction(data);
        long elapsed =  System.currentTimeMillis() - start;
        System.out.println("Elapsed: " + elapsed);

    }
}
