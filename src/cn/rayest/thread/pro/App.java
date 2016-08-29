package cn.rayest.thread.pro;

/**
 * Created by Rayest on 2016/7/10 0010.
 */


public class App{
    public static void main(String[] args) {
        Movie movie = new Movie();

        Player player = new Player(movie);
        Watcher watcher = new Watcher(movie);

        Thread thread1 = new Thread(player);
        Thread thread2 = new Thread(watcher);

        thread1.start();
        thread2.start();
    }
}

//  共同的资源：movie
/*  信号灯：flag--->true---->生产者生产，消费者等待，生产完毕通知消费者
*          flag---->false--->消费者消费，生产者等待，消费完毕通知生产者
* */
class Movie {
    private String pic;
    private boolean flag = true;
    public synchronized void play(String pic){
        if (!flag){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
//        开始生产
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
 //        生产完毕
        this.pic = pic;
//        通知消费
        this.notify();
//        生产者停下
        this.flag = false;
    }

    public synchronized void watch(){
        if (flag){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
//        开始消费
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(pic);
//        消费完毕
 //        通知生产
        this.notifyAll();
//        消费停止
        this.flag = true;
    }
}

//  生产者
class Player implements Runnable{
    private Movie movie;

    public Player(Movie movie) {
        this.movie = movie;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            if (i % 2 == 0){
                movie.play("左青龙");
            }else {
                movie.play("右白虎");
            }
        }
    }
}

//  消费者
class Watcher implements Runnable{

    private Movie movie;

    public Watcher(Movie movie) {
        this.movie = movie;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            movie.watch();
        }
    }
}