package cn.rayest.hoding.collection.stack;

import java.util.LinkedList;

/**
 * Created by Rayest on 2016/8/2 0002.
 */
public class Stack<T> {
    private LinkedList<T> storage = new LinkedList<T>();

    public void push(T v){
        storage.addFirst(v);
    }

    public T peek(){
        return storage.getFirst();
    }

    public T pop(){
        return storage.removeFirst();
    }

    public boolean empty(){
        return storage.isEmpty();
    }

    public String toString(){
        return storage.toString();
    }
}
