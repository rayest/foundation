package cn.rayest.thread.syn;

/**
 * Created by Rayest on 2016/7/10 0010.
 */
public class SynDemo01 {
    public static void main(String[] args) {
        Web12305 web = new Web12305();

        Thread t1 = new Thread(web, "路人甲");
        Thread t2 = new Thread(web, "黄牛乙");
        Thread t3 = new Thread(web, "攻城狮");

        t1.start();
        t2.start();
        t3.start();
    }
}


class Web12305 implements Runnable{
    private int number = 10;
    private boolean flag = true;

    @Override
    public void run() {
        while (flag){
            test1();
        }
    }

//    1. 线程安全
    public synchronized void test1(){
//        2.或synchronized(this){}
//       不能synchronized(number)，要对象加锁
        if (number <= 0){
            flag = false; // 跳出循环
            return;
        }

//        3. 或synchronized(this){}
        try {
            Thread.sleep(500); // 模拟延时
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "抢到了" + number--);
    }
}