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
            offer(): ��һ��Ԫ�ز��뵽��β�����Ƿ��� false

            peek(): ���ض���ɾ����ͷԪ�أ��� null ֵ
            element(): ���ض���ɾ����ͷԪ�أ����쳣

            poll(): ������ɾ����ͷԪ�أ��� null ֵ
            remove(): ������ɾ����ͷԪ�أ����쳣

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
