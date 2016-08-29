package cn.rayest.hoding.collection.queue;

import java.util.*;

import static cn.rayest.hoding.collection.queue.AppQueue.printQueue;
import static net.mindview.util.Print.print;

/**
 * Created by Rayest on 2016/8/2 0002.
 */
public class AppPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        Random random = new Random(47);
        for (int i = 0; i < 10; i++) {
            priorityQueue.offer(random.nextInt(i + 10));
        }
        printQueue(priorityQueue);

        List<Integer> ints = Arrays.asList(25, 22, 20, 18, 14, 9, 3, 1, 1, 2, 3, 9, 14, 18, 21, 23, 25);
        priorityQueue = new PriorityQueue<>(ints);
        printQueue(priorityQueue);

        // 获取 ints 的反序
        priorityQueue = new PriorityQueue<>(ints.size(), Collections.reverseOrder());
        priorityQueue.addAll(ints);
        printQueue(priorityQueue);

        String s = "PayAndRay is two person";
        List<String> strings = Arrays.asList(s.split(""));
        PriorityQueue<String> stringPriorityQueue = new PriorityQueue<>(strings);
        printQueue(stringPriorityQueue);

        // char set
        Set<Character> charSet = new HashSet<>();
        for (char c : s.toCharArray()){
            charSet.add(c);
        }
        print(charSet);

        // char set 的优先队列
        PriorityQueue<Character> charPriorityQueue = new PriorityQueue<>(charSet);
        printQueue(charPriorityQueue);


    }
}
