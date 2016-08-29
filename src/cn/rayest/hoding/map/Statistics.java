package cn.rayest.hoding.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Created by Rayest on 2016/8/2 0002.
 */
public class Statistics {
    public static void main(String[] args) {
        Random random =new Random(47);
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < 10000; i++) {
            /*
                统计 0 ~ 19 间的 20 个数值出现的次数
                key: 0 ~ 19 的数值，每个键唯一
                value：每个数值出现的次数
            */
            int key = random.nextInt(20);
            /*
               获取每个键对应的值，判断其是否为空；
               若为空：则值赋值为 1
               若不为空：则值增加 1
               在获得 键/值 对后，添加到映射中
            */

            Integer value = map.get(key);
            map.put(key, value == null ? 1 : value + 1);
        }
        System.out.println(map);

    }
}
