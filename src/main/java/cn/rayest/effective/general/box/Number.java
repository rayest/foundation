package cn.rayest.effective.general.box;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rayest on 2016/12/1 0001.
 */
public class Number {
    public static void main(String[] args) {
        // 参数化类型必须为装箱基本类型
        List<Integer> numberList = new ArrayList<>();
        numberList.add(1);
        numberList.add(2);
        numberList.add(3);
        numberList.add(4);
        numberList.add(5);
        numberList.add(6);
        numberList.add(7);
        numberList.add(8);
        System.out.println(numberList);
    }
}
