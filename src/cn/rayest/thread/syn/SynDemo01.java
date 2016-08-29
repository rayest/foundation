package cn.rayest.thread.syn;

/**
 * Created by Rayest on 2016/7/10 0010.
 */
public class SynDemo01 {
    public static void main(String[] args) {
        Web12305 web = new Web12305();

        Thread t1 = new Thread(web, "·�˼�");
        Thread t2 = new Thread(web, "��ţ��");
        Thread t3 = new Thread(web, "����ʨ");

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

//    1. �̰߳�ȫ
    public synchronized void test1(){
//        2.��synchronized(this){}
//       ����synchronized(number)��Ҫ�������
        if (number <= 0){
            flag = false; // ����ѭ��
            return;
        }

//        3. ��synchronized(this){}
        try {
            Thread.sleep(500); // ģ����ʱ
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "������" + number--);
    }
}