package cn.rayest.jvm.classloading;

/**
 * Created by Rayest on 2016/7/11 0011.
 */
public class NotInitialization3 {
    public static void main(String[] args) {
        System.out.println(ConstClass.HELLOWORLD);
    }
}

class ConstClass{
    static {
        System.out.println("ConstClass init!");
    }

    public static final String HELLOWORLD = "hello world!";
}
