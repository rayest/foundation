package cn.rayest.upcasting;

/**
 * Created by Rayest on 2016/7/25 0025.
 */
public class Application_03 {
    public static void main(String[] args) {
        Parent son = new Son(); // upcasting
        // 1. ���þ�̬����ʱ����Ϊ�����ж�̬�ԣ���Ϊ��̬�����Ǻ��������
        // 2. ������ͨ����ʱ����Ϊ���ж�̬�ԣ���Ϊ��ͨ�����Ǻ;���ĵ������������
        System.out.println(son.staticGet());
        System.out.println(son.dynamicGet());
    }
}
class Parent{
    public static String staticGet(){
        return "Parent.staticGet()...";
    }
    public String dynamicGet(){
        return "Parent.dynamicGet()...";
    }
}
class Son extends Parent{
    public static String staticGet(){
        return "Son.staticGet()...";
    }
    public String dynamicGet(){
        return "Son.dynamicGet()...";
    }
}