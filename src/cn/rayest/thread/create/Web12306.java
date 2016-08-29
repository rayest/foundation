package cn.rayest.thread.create;

/**
 * Created by Rayest on 2016/7/8 0008.
 */
public class Web12306 implements Runnable {
    private int num = 5000;

    @Override
    public void run() {
        while (true) {
            if (num <= 0) {
                break;
            }
            System.out.println(Thread.currentThread().getName() + "抢到了" + num--);
        }
    }

    public static void main(String[] args) {
        Web12306 web = new Web12306();
        Thread thread1 = new Thread(web, "路人甲");
        Thread thread2 = new Thread(web, "黄牛乙");
        Thread thread3 = new Thread(web, "攻城狮");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}

