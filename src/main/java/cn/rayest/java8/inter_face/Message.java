package cn.rayest.java8.inter_face;

/**
 * Created by Rayest on 2016/11/19 0019.
 * default
 * static
 */
public interface Message {
    void print();

    default void showDefault() {
        System.out.println("接口中定义的普通方法，该方法拥有方法体");
    }
    static void showStatic(){
        System.out.println("接口中定义的静态方法");
    }
}
