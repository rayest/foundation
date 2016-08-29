package cn.rayest.hoding.collection.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/**
 * Created by Rayest on 2016/8/2 0002.
 */
public class AppQueue {

    public static void printQueue(Queue queue){
        /*
            offer(): 将一个元素插入到队尾，或是返回 false

            peek(): 返回而不删除队头元素，或 null 值
            element(): 返回而不删除队头元素，或异常

            poll(): 返回且删除队头元素，或 null 值
            remove(): 返回且删除队头元素，或异常

        */

        while (queue.peek() != null){
            System.out.print((queue.remove() + " "));
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // int queue
        Queue<Integer> intQueue = new LinkedList<>();
        Random random = new Random(47);
        for (int i = 0; i < 10; i++) {
            intQueue.offer(random.nextInt(i + 10));
        }
        printQueue(intQueue);

        // char queue
        Queue<Character> charQueue = new LinkedList<>();
        for(char c : "RayAndPay".toCharArray()){
            charQueue.offer(c);
        }
        printQueue(charQueue);


    }
}
