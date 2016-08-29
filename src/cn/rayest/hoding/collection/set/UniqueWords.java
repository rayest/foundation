package cn.rayest.hoding.collection.set;

import net.mindview.util.TextFile;

import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Rayest on 2016/8/2 0002.
 */
public class UniqueWords {
    public static void main(String[] args) {
        Set<String> words = new TreeSet<>(new TextFile("/cn/rayest/hoding/collection/set/AppSetOperations.java", "\\W+"));
        System.out.println(words);
    }
}
