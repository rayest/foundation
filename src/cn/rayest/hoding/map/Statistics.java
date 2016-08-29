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
                ͳ�� 0 ~ 19 ��� 20 ����ֵ���ֵĴ���
                key: 0 ~ 19 ����ֵ��ÿ����Ψһ
                value��ÿ����ֵ���ֵĴ���
            */
            int key = random.nextInt(20);
            /*
               ��ȡÿ������Ӧ��ֵ���ж����Ƿ�Ϊ�գ�
               ��Ϊ�գ���ֵ��ֵΪ 1
               ����Ϊ�գ���ֵ���� 1
               �ڻ�� ��/ֵ �Ժ���ӵ�ӳ����
            */

            Integer value = map.get(key);
            map.put(key, value == null ? 1 : value + 1);
        }
        System.out.println(map);

    }
}
