package cn.rayest.thread.create;

/**
 * Created by Rayest on 2016/7/8 0008.
 */
public class PrintApp {
    public static void main(String[] args) {

        PrintChar printA = new PrintChar(10000, 'a');
        PrintNum print50 = new PrintNum(10000, 50);

        Thread thread1 = new Thread(printA);
        Thread thread2 = new Thread(print50);

        thread1.start();
        thread2.start();
    }
}

class PrintChar implements Runnable{

    private int times;
    private char charToPrint;

    public PrintChar(int times, char charToPrint) {
        this.times = times;
        this.charToPrint = charToPrint;
    }

    @Override
    public void run() {
        for (int i = 0; i < times; i++) {
            System.out.println(charToPrint);
        }
    }
}

class PrintNum implements Runnable{

    private int times;
    private int numToPrint;

    public PrintNum(int times, int numToPrint) {
        this.times = times;
        this.numToPrint = numToPrint;
    }

    @Override
    public void run() {
        for (int i = 0; i < times; i++) {
            System.out.println(numToPrint);
        }
    }
}