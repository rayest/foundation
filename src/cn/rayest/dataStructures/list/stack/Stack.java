package cn.rayest.dataStructures.list.stack;

import java.util.LinkedList;

/**
 * Created by Rayest on 2016/8/6 0006.
 * �� LinkedList ʵ��ջ
 */

public class Stack<T> {
    private LinkedList<T> list = new LinkedList<T>();

    // ��ջ
    public void push(T element){
        list.addFirst(element);
    }

    // ��ջ������ɾ��
    public T peek(){
        return list.getFirst();
    }

    // ��ջ��ɾ��
    public T pop(){
        return list.removeFirst();
    }

    // �ж�ջ�Ƿ�Ϊ��
    public boolean isEmpty(){
        return list.isEmpty();
    }

    // ��ӡջԪ��
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
