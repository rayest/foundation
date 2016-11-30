package cn.rayest.effective.parameter;

/**
 * Created by Rayest on 2016/11/30 0030.
 */
public class Application {
    public static void main(String[] args) {
        People people = new People();
        System.out.println(people.takeAWalk(new Dog()));
        System.out.println(people.takeAWalk(new Cat()));
    }
}
