package cn.rayest.thread.status;

/**
 * Created by Rayest on 2016/7/9 0009.
 */
public class StopDemo01 {
    public static void main(String[] args) {
        Study study = new Study();
        new Thread(study).start();

//        �ⲿ����
        for (int i = 0; i < 10000; i++) {
            if (i == 8000){  // �ⲿ����
                study.stop();
            }
            System.out.println("main...--->" + i);
        }
    }
}

class Study implements Runnable{
//  1. �߳����ж����߳���ʹ�õı�ʶ
    private boolean flag = true;

    @Override
    public void run() {
//        2. �߳���ʹ�øñ�ʶ
        while (flag){
            System.out.println("study thread...");
        }
    }
//    3. �����ṩ�����ı��ʶ
    public void stop(){
        this.flag = false;
    }
}