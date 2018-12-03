package com.github.vedeshkin.homework2;

import java.util.EmptyStackException;

/**
 * Created by Vedeshkin on 12/3/2018.
 * All right reserved.
 */
public class MyStack <T> {


    private int maxSize = 10;
    private T [] stack;
    private int top;

    @SuppressWarnings("unchecked")
    public MyStack()
    {
        stack = (T[]) new Object[maxSize];
        this.top = -1;

    }
    @SuppressWarnings("unchecked")
    private void resizeStack(){
        int newSize = maxSize * 2;
        T [] newStack = (T[])new Object[newSize];
        System.arraycopy(stack,0,newStack,0,stack.length);
        this.stack = newStack;
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    private boolean isFull() {
        return (top == maxSize-1);
    }

    public void push(T element) {
        if(!this.isFull()) {
            ++top;
            stack[top] = element;
        }
        else {
            resizeStack();
            stack[++top] = element;
        }
    }
    public T peek() {
        return stack[top];
    }
    public T pop() {
        if(!this.isEmpty())
            return stack[top--];
        else {
            throw new EmptyStackException();
        }
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        int i = top;
         while(0 < i){
             sb.append(stack[i]);
             i--;
         }
        return  sb.toString();
    }
}
