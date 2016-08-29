package cn.rayest.hoding.collection.set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Rayest on 2016/8/2 0002.
 */
public class AppSetOperations {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        // 通过 Collections 类的 addAll 静态方法，将相应的元素添加到集合 HashSet的 set1 对象中
        Collections.addAll(set1, "A B C D E F G H I J K L".split(" "));
        System.out.println(set1);

        // 向集合 set1 中添加元素
        set1.add("M");
        System.out.println(set1);

        // 判断集合中是否包含特定元素
        System.out.println(set1.contains("H"));
        System.out.println(set1.contains("N"));

        Set<String> set2 = new HashSet<>();
        Collections.addAll(set2, "H I J K L".split(" "));

        // 判断集合 set1 中是否包含 set2
        System.out.println(set1.containsAll(set2));
        System.out.println(set1);

        // 从集合 set1 中删除与 set2 相同的片段
        set1.removeAll(set2);
        System.out.println(set1);


    }
}
