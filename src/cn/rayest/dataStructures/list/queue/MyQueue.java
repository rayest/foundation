package cn.rayest.dataStructures.list.queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Rayest on 2016/8/6 0006.
 */
public class MyQueue<T> {
    private Queue<T> queue = new LinkedList<T>();

    // ���β����Ԫ��
    public void offer(T element){
        queue.offer(element);
    }

    // ���ض�ͷ������ɾ����ͷ���������Ϊ�գ��򷵻� null
    public T peek(){
        return queue.peek();
    }

    // ���ض�ͷ������ɾ����ͷ���������Ϊ�գ����׳��쳣
    public T element(){
        return queue.element();
    }

    // ���ض�ͷ��ɾ����ͷ���������Ϊ�գ��򷵻� null
    public T poll(){
        return queue.poll();
    }

    // ���ض�ͷ��ɾ����ͷ���������Ϊ�գ����׳��쳣
    public T remove(){
        return queue.remove();
    }

    // �ж϶����Ƿ�Ϊ��
    public boolean isEmpty(){
        return queue.isEmpty();
    }

    // ��ӡ����Ԫ��
    public String toString(){
        return " " + queue.toString();
    }

    public static void main(String[] args) {
        MyQueue<String> queue = new MyQueue();
        queue.offer("Pay");
        queue.offer("Ray");
        queue.offer("Candy");
        System.out.println(queue.toString());

        Object object = queue.peek();
        System.out.println(object + "----" + queue.toString());

        object = queue.element();
        System.out.println(object + "----" + queue.toString());

        object = queue.poll();
        System.out.println(object + "----" + queue.toString());

        object = queue.remove();
        System.out.println(object + "----" + queue.toString());

        System.out.println(object + "----" + queue.toString());
        System.out.println(queue);

    }



}
