package cn.rayest.java8.lambda.thread;

/**
 * Created by Rayest on 2016/12/2 0002.
 */
public class WorkerApplication {
    public static void main(String[] args) {
        Worker worker = new Worker();
        new Thread(worker).start();
    }
}
