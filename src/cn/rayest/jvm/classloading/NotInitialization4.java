package cn.rayest.jvm.classloading;

/**
 * Created by Rayest on 2016/7/11 0011.
 */
public class NotInitialization4 {
    public static void main(String[] args) {
        System.out.println(Sub.B);
    }
}

class Parent{
    public static int A = 1;

    static {
        A = 2;
    }
}
class Sub{
    public static int B = Parent.A;
}

