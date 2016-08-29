package cn.rayest.pattern.singleton;

/**
 * Created by Rayest on 2016/7/15 0015.
 */
class Singleton {

    private static Singleton uniqueInstance;

    private Singleton(){}

    public static Singleton getInstance(){
        if (uniqueInstance == null){
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;

    }
}

public class AppSingleton{
    public static void main(String[] args) {
        Singleton object1 = Singleton.getInstance();
        Singleton object2 = Singleton.getInstance();
        System.out.println(object1 == object2);
    }
}
