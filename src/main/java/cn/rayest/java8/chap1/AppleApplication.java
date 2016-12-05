package cn.rayest.java8.chap1;

import java.util.Arrays;
import java.util.List;

import static cn.rayest.java8.chap1.AppleFilter.filterApples;

/**
 * Created by Rayest on 2016/12/5 0005.
 */
public class AppleApplication {
    public static void main(String[] args) {
        List<Apple> inventory = Arrays.asList(
                new Apple(80, "green"),
                new Apple(160, "green"),
                new Apple(120, "red"));

        List<Apple> greenApples = filterApples(inventory, AppleFilter::isGreenApple);
        System.out.println(greenApples);

        List<Apple> heavyApples = filterApples(inventory, AppleFilter::isHeavyApple);
        System.out.println(heavyApples);
        
    }
}
