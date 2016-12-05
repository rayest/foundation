
package cn.rayest.java8.chap1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by Rayest on 2016/12/5 0005.
 */
public class AppleFilter {
    // 判断是否为绿苹果
    public static boolean isGreenApple(Apple apple) {
        return "green".equals(apple.getColor());
    }

    // 判断是否是比较重的苹果
    public static boolean isHeavyApple(Apple apple) {
        return apple.getWeight() > 150;
    }

    // 过滤绿苹果
    public static List<Apple> filterGreenApple(List<Apple> inventory) {
        List<Apple> greenApples = new ArrayList<>();
        for (Apple apple : inventory) {
            if ("green".equals(apple.getColor())) {
                greenApples.add(apple);
            }
        }
        return greenApples;
    }

    // 过滤重苹果
    public static List<Apple> isHeavyApple(List<Apple> inventory) {
        List<Apple> heavyApples = new ArrayList<>();
        for (Apple apple : inventory) {
            if (apple.getWeight() > 150) {
                heavyApples.add(apple);
            }
        }
        return heavyApples;
    }

    //
    public static List<Apple> filterApples(List<Apple> inventory, Predicate<Apple> predicate) {
        List<Apple> apples = new ArrayList<>();
        for (Apple apple : inventory) {
            if (predicate.test(apple)) {
                apples.add(apple);
            }
        }
        return apples;
    }
}
