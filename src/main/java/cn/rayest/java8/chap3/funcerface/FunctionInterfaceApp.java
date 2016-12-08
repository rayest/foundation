package cn.rayest.java8.chap3.funcerface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by Rayest on 2016/12/7 0007.
 */
public class FunctionInterfaceApp {
    public static void main(String[] args) {

        Predicate<String> nonEmptyStringPredicate = (String s) -> !s.isEmpty();
        List<String> nonEmpty = FunctionInterface.filter(Arrays.asList("Hello", "Lee", "Rayest", "Jack", "Mick", "World", "Nice", "Better"), nonEmptyStringPredicate);
        System.out.println(nonEmpty);

        FunctionInterface.forEach(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9), (Integer i) -> System.out.println(i));
    }
}
