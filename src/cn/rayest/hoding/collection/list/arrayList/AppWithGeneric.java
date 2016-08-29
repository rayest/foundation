package cn.rayest.hoding.collection.list.arrayList;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rayest on 2016/8/1 0001.
 */
public class AppWithGeneric {
    public static void main(String[] args) {
        List<Apple> appleList = new ArrayList();

        appleList.add(new Apple("green", 1));
        appleList.add(new Apple("red", 2));
        appleList.add(new Apple("yellow", 3));


        /*  ±àÒëÆ÷´íÎó
            appleList.add(new Orange("green", 1));
            appleList.add(new Orange("red", 2));
            appleList.add(new Orange("yellow", 3));
        */

        for (int i = 0; i < appleList.size(); i++) {
            System.out.println(appleList.get(i).toString());
        }
    }
}

