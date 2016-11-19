package cn.rayest.java8.inter_face;

/**
 * Created by Rayest on 2016/11/19 0019.
 */
public class MessageImpl implements Message {
    @Override
    public void print() {
        System.out.println("实现接口中原本的方法");
    }
}
