package cn.rayest.thread.status;

/**
 * join:�ϲ��߳�
 * Created by Rayest on 2016/7/9 0009.
 */


public class JoinDemo01 extends Thread{
    public static void main(String[] args) throws InterruptedException {

        JoinDemo01 demo01 = new JoinDemo01();
        Thread thread = new Thread(demo01); // �½�
        thread.start(); // ����
        // CPU����

        for (int i = 0; i < 10; i++) {

            if (5 == i){
                thread.join(); // main������
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
