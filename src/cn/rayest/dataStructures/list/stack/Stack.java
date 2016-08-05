package cn.rayest.dataStructures.list.stack;

import java.util.LinkedList;

/**
 * Created by Rayest on 2016/8/6 0006.
 * 用 LinkedList 实现栈
 */

public class Stack<T> {
    private LinkedList<T> list = new LinkedList<T>();

    // 入栈
    public void push(T element){
        list.addFirst(element);
    }

    // 出栈，但不删除
    public T peek(){
        return list.getFirst();
    }

    // 出栈，删除
    public T pop(){
        return list.removeFirst();
    }

    // 判断栈是否为空
    public boolean isEmpty(){
        return list.isEmpty();
    }

    // 打印栈元素
    public String toString(){
        return list.toString();
    }

    public static void main(String[] args) {
        Stack<String> stack = new Stack();

        stack.push("Pay");
        stack.push("Candy");
        stack.push("Ray");

        System.out.println(stack.toString());

        Object object = stack.peek();
        System.out.println(object + "----" + stack.toString());

        object = stack.pop();
        System.out.println(object + "----" + stack.toString());

        System.out.println("Empty: " + stack.isEmpty());

    }
}
