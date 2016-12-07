package cn.rayest.java8.chap3;

/**
 * Created by Rayest on 2016/12/7 0007.
 */
public class Application {
    public static void main(String[] args) {
        // 1. Lambda 表达式赋值给一个变量
        Runnable run = () -> System.out.println("Hello");
        run.run();

        // 2. Lambda 表达式作为参数传递给一个方法
        process(() -> System.out.println("Hello"));
    }

    public static void process(Runnable runnable) {
        runnable.run();
    }
}
