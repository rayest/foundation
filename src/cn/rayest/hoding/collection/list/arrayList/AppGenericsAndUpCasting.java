package cn.rayest.hoding.collection.list.arrayList;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rayest on 2016/8/1 0001.
 */
public class AppGenericsAndUpCasting {
    public static void main(String[] args) {

        List<Apple> apples = new ArrayList<>();

        apples.add(new LanzhouApple("Lanzhou"));
        apples.add(new NanjingApple("Nanjing"));

        for (Apple apple : apples) {
            System.out.println(apple);
        }
    }
}
