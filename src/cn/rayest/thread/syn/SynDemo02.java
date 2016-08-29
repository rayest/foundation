package cn.rayest.thread.syn;

/**
 * 单例模式
 * 懒汉：
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


// 懒汉式单例模式
class Jvm {
    //  1. 声明一个私有的静态变量
    private static Jvm instance = null;

    //  2.构造器私有化，避免外部直接创建对象
    private Jvm() {

    }

    //  3. 创建一个对外公共的静态方法 访问该变量，如果变量没有对象，则创建该对象
    public static Jvm getInstance(long time) {
//        提高效率，提高已经存在对象的访问效率
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
        System.out.println(Thread.currentThread().getName() + "--->创建" + Jvm.getInstance(time));
    }
}

