package cn.rayest.pattern.preSingleton;

/**
 * Created by Rayest on 2016/7/15 0015.
 */
class MyClass2 {
    private MyClass2() {   // ˽�й�����
    }

    private static MyClass2 getInstance() {
        return new MyClass2();
    }
}

public class AppMyClass2 {
    public static void main(String[] args) {

        // ӵ��˽�й��������಻�ܱ�ʵ���������¶Ը����ʵ�����Ǵ����
        // MyClass2 object1 = new MyClass2();
    }
}


