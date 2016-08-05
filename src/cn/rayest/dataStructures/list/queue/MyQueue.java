package cn.rayest.dataStructures.list.queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Rayest on 2016/8/6 0006.
 */
public class MyQueue<T> {
    private Queue<T> queue = new LinkedList<T>();

    // 向对尾插入元素
    public void offer(T element){
        queue.offer(element);
    }

    // 返回队头，但不删除队头。如果队列为空，则返回 null
    public T peek(){
        return queue.peek();
    }

    // 返回队头，但不删除队头。如果队列为空，则抛出异常
    public T element(){
        return queue.element();
    }

    // 返回队头并删除队头。如果队列为空，则返回 null
    public T poll(){
        return queue.poll();
    }

    // 返回队头并删除队头。如果队列为空，则抛出异常
    public T remove(){
        return queue.remove();
    }

    // 判断队列是否为空
    public boolean isEmpty(){
        return queue.isEmpty();
    }

    // 打印队列元素
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
