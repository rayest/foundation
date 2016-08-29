package cn.rayest.thread.syn;

/**过多同步容易造成死锁
 * Created by Rayest on 2016/7/10 0010.
 */
public class SynDemo03 {
    public static void main(String[] args) {
        Object money = new Object();
        Object goods = new Object();

        Test1 test1 = new Test1(money, goods);
        Test2 test2 = new Test2(money, goods);

        Thread thread1 = new Thread(test1);
        Thread thread2 = new Thread(test2);

        thread1.start();
        thread2.start();
    }
}

class Test1 implements Runnable{

    Object money;
    Object goods;

    public Test1(Object money, Object goods) {
        this.money = money;
        this.goods = goods;
    }

    @Override
    public void run() {
        while (true){
            test();
        }
    }

    private void test() {
        synchronized (goods){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (money){

            }
        }
        System.out.println("一手给钱");
    }
}

class Test2 implements Runnable{

    Object money;
    Object goods;

    public Test2(Object money, Object goods) {
        this.money = money;
        this.goods = goods;
    }

    @Override
    public void run() {
        while (true){
            test();
        }
    }

    private void test() {
        synchronized (money){
            try {
                Thread.sleep(800);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (goods){

            }
        }
        System.out.println("一手给货");
    }
}
