package cn.rayest.pattern.preSingleton;

/**
 * Created by Rayest on 2016/7/15 0015.
 */
class MyClass1 {

}

public class AppMyClass1{
    public static void main(String[] args) {
        MyClass1 object1 = new MyClass1();
        MyClass1 object2 = new MyClass1();
        System.out.println(object1 == object2);
    }
}
