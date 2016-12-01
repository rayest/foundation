package cn.rayest.effective.general;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Rayest on 2016/12/1 0001.
 * 遍历
 */
public class Loop {
    public static void main(String[] args) {
        // for each 循环（优选）
        String[] words = {"Hello", "World", "Good", "Nice", "leaves"};
        for (String word : words) {
            System.out.print(word + " ");
        }
        System.out.println();

        // 遍历器循环，适用于集合遍历（不优先）
        List nameList = new ArrayList();
        nameList.add("Rayest");
        nameList.add("Richard");
        nameList.add("Black");
        nameList.add("White");
        nameList.add("Jack");
        for (Iterator iterator = nameList.iterator(); iterator.hasNext(); ) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // for 循环
        int[] numberArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        for (int i = 0; i <numberArray.length; i++) {
            System.out.print(numberArray[i] + " ");
        }
    }
}
