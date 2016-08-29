package cn.rayest.pattern.preSingleton;

/**
 * Created by Rayest on 2016/7/15 0015.
 */
class MyClass2 {
    private MyClass2() {   // 私有构造器
    }

    private static MyClass2 getInstance() {
        return new MyClass2();
    }
}

public class AppMyClass2 {
    public static void main(String[] args) {

        // 拥有私有构造器的类不能被实例化：以下对该类的实例化是错误的
        // MyClass2 object1 = new MyClass2();
    }
}


