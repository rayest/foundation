package cn.rayest.thread.status;

/**
 * Created by Rayest on 2016/7/9 0009.
 */
public class StopDemo01 {
    public static void main(String[] args) {
        Study study = new Study();
        new Thread(study).start();

//        外部干涉
        for (int i = 0; i < 10000; i++) {
            if (i == 8000){  // 外部干涉
                study.stop();
            }
            System.out.println("main...--->" + i);
        }
    }
}

class Study implements Runnable{
//  1. 线程类中定义线程体使用的标识
    private boolean flag = true;

    @Override
    public void run() {
//        2. 线程体使用该标识
        while (flag){
            System.out.println("study thread...");
        }
    }
//    3. 对外提供方法改变标识
    public void stop(){
        this.flag = false;
    }
}