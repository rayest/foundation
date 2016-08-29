package cn.rayest.thread.heheself;

/**
 * Created by Rayest on 2016/7/10 0010.
 */
public class Demo01{
    public static void main(String[] args){
        Kobe kobe = new Kobe();
        Jordan jordan = new Jordan();

        Thread t1 = new Thread(kobe);
        Thread t2 = new Thread(jordan);

        t1.start();
        t2.start();

    }
}

class Kobe implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {

                 System.out.println("kobe Í¶Àº£¡");

        }
    }
}

class Jordan implements Runnable{
    @Override
    public void run() {
        try {
            Thread.sleep(500);
            System.out.println("Jordan Í¶Àº£¡");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}