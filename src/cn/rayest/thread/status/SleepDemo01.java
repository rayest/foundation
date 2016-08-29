package cn.rayest.thread.status;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Rayest on 2016/7/9 0009.
 */
public class SleepDemo01 extends Thread {
    public static void main(String[] args) throws InterruptedException {
//        1. 倒计时10个数
        int number = 10;
        while (true){
            System.out.println(number--);
            Thread.sleep(1000);
            if (number <= 0){
                break;
            }
        }

//        倒计时
        Date endTime = new Date(System.currentTimeMillis() * 10 * 1000);
       long end = endTime.getTime();
        while (true){
            System.out.println(new SimpleDateFormat("mm:ss").format(endTime));
            endTime = new Date(endTime.getTime() - 1000);
            Thread.sleep(1000);
            if ((end - 10000) > endTime.getTime()){
                break;
            }
        }
    }

    public static void countdown(){

    }
}
