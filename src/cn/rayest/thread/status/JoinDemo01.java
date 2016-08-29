package cn.rayest.thread.status;

/**
 * join:合并线程
 * Created by Rayest on 2016/7/9 0009.
 */


public class JoinDemo01 extends Thread{
    public static void main(String[] args) throws InterruptedException {

        JoinDemo01 demo01 = new JoinDemo01();
        Thread thread = new Thread(demo01); // 新建
        thread.start(); // 就绪
        // CPU调度

        for (int i = 0; i < 10; i++) {

            if (5 == i){
                thread.join(); // main的阻塞
            }
            System.out.println("main...");
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("join...");
        }
    }
}
