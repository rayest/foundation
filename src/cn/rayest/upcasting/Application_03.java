package cn.rayest.upcasting;

/**
 * Created by Rayest on 2016/7/25 0025.
 */
public class Application_03 {
    public static void main(String[] args) {
        Parent son = new Son(); // upcasting
        // 1. 调用静态方法时，行为不具有多态性，因为静态方法是和类关联的
        // 2. 调用普通方法时，行为具有多态性，因为普通方法是和具体的单个对象关联的
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