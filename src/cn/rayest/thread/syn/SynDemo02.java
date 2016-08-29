package cn.rayest.thread.syn;

/**
 * ����ģʽ
 * ������
 * Created by Rayest on 2016/7/10 0010.
 */
public class SynDemo02 {
    public static void main(String[] args) {
        JvmThread thread1 = new JvmThread(100);
        JvmThread thread2 = new JvmThread(200);
        thread1.start();
        thread2.start();
    }
}


// ����ʽ����ģʽ
class Jvm {
    //  1. ����һ��˽�еľ�̬����
    private static Jvm instance = null;

    //  2.������˽�л��������ⲿֱ�Ӵ�������
    private Jvm() {

    }

    //  3. ����һ�����⹫���ľ�̬���� ���ʸñ������������û�ж����򴴽��ö���
    public static Jvm getInstance(long time) {
//        ���Ч�ʣ�����Ѿ����ڶ���ķ���Ч��
      if (instance == null) {
            synchronized (Jvm.class) {
                if (instance == null) {
                    try {
                        Thread.sleep(time);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    instance = new Jvm();
                }
                return instance;
            }
        }
        return instance;
    }
}

class JvmThread extends Thread {
    private long time;

    public JvmThread() {
    }

    public JvmThread(long time) {
        this.time = time;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "--->����" + Jvm.getInstance(time));
    }
}

