package cn.rayest.thread.status;

/** yield: 暂停当前线程，执行其他线程
 * Created by Rayest on 2016/7/9 0009.
 */
public class YieldDemo01 extends Thread{
    public static void main(String[] args) {
        YieldDemo01 demo01 = new YieldDemo01();
        Thread thread = new Thread(demo01);
        thread.start();

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0){
                Thread.yield();
            }
            System.out.println("main......");
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("yield.....");
        }
    }
}
