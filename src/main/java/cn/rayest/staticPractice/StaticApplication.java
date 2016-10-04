package cn.rayest.staticPractice;

/**
 * Created by Rayest on 2016/10/4 0004.
 */
public class StaticApplication {

    // 静态块只执行一次（一个类）
    static {
        System.out.println("static");
    }

    // 非静态块执行多次（多个对象）
    {
        System.out.println("non-static");
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            StaticApplication application = new StaticApplication();
        }
    }
}
