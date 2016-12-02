package cn.rayest.java8.lambda.thread;

/**
 * Created by Rayest on 2016/12/2 0002.
 */
public class Worker implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(i);
        }
    }
}
