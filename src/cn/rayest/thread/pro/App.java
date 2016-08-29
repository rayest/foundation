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

//  ��ͬ����Դ��movie
/*  �źŵƣ�flag--->true---->�����������������ߵȴ����������֪ͨ������
*          flag---->false--->���������ѣ������ߵȴ����������֪ͨ������
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
//        ��ʼ����
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
 //        �������
        this.pic = pic;
//        ֪ͨ����
        this.notify();
//        ������ͣ��
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
//        ��ʼ����
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(pic);
//        �������
 //        ֪ͨ����
        this.notifyAll();
//        ����ֹͣ
        this.flag = true;
    }
}

//  ������
class Player implements Runnable{
    private Movie movie;

    public Player(Movie movie) {
        this.movie = movie;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            if (i % 2 == 0){
                movie.play("������");
            }else {
                movie.play("�Ұ׻�");
            }
        }
    }
}

//  ������
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