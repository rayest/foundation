package cn.rayest.java8.inter_face;

/**
 * Created by Rayest on 2016/11/19 0019.
 */
public class Application {
    public static void main(String[] args) {
        Message message = new MessageImpl();
        message.showDefault(); // 该方法是在接口中直接定义的
        message.print();
    }
}