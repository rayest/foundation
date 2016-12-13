package cn.rayest.java8.chap3.functionComposite;

import java.util.function.Function;

/**
 * Created by Rayest on 2016/12/13 0013.
 */
public class Letter {
    public static String addHeader(String text) {
        return "Header: " + text;
    }

    public static String addFooter(String text) {
        return "Footer: " + text;
    }

    public static String checkSpelling(String text) {
        return text.replaceAll("labda", "lambda");
    }

    public static void getComposite(){
        Function<String, String> addHeader = Letter::addHeader;
        Function<String, String> transformationPipeline = addHeader.andThen(Letter::checkSpelling).andThen(Letter::addFooter);
    }

}
