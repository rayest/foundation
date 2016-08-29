package cn.rayest.hoding.collection.set;

import java.util.*;

/**
 * Created by Rayest on 2016/8/2 0002.
 */
public class AppSet {
    public static void main(String[] args) {
        Random random = new Random(47);
        Set<Integer> intSet = new HashSet<>();
        for (int i = 0; i < 10000; i++) {
            intSet.add(random.nextInt(30));
        }

        System.out.println(intSet);

        SortedSet<Integer> intSet2 = new TreeSet<>();
        for (int i = 0; i < 10000; i++) {
            intSet2.add(random.nextInt(30));
        }
        System.out.println(intSet2);

    }


}
