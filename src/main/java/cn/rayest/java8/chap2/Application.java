package cn.rayest.java8.chap2;

/**
 * Created by Rayest on 2016/12/6 0006.
 */
public class Application {
    public static void main(String[] args) {

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Where is Lambda?");
            }
        });

        Thread t2 = new Thread(() -> System.out.println("This is Lambda."));

    }
}
