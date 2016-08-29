package cn.rayest.io.nio;

import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.SortedMap;

/**
 * Created by Rayest on 2016/8/4 0004.
 */
public class AvailableCharSets {
    public static void main(String[] args) {
        // java.nio.charset.Charset 类支持多种不同的字符集
        SortedMap<String, Charset> charSets = Charset.availableCharsets();
        Iterator<String> iterator = charSets.keySet().iterator();
        while (iterator.hasNext()){
            String charSetName = iterator.next();
            System.out.println(charSetName);
        }
    }
}
