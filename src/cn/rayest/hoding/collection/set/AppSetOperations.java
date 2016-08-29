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
        // ͨ�� Collections ��� addAll ��̬����������Ӧ��Ԫ����ӵ����� HashSet�� set1 ������
        Collections.addAll(set1, "A B C D E F G H I J K L".split(" "));
        System.out.println(set1);

        // �򼯺� set1 �����Ԫ��
        set1.add("M");
        System.out.println(set1);

        // �жϼ������Ƿ�����ض�Ԫ��
        System.out.println(set1.contains("H"));
        System.out.println(set1.contains("N"));

        Set<String> set2 = new HashSet<>();
        Collections.addAll(set2, "H I J K L".split(" "));

        // �жϼ��� set1 ���Ƿ���� set2
        System.out.println(set1.containsAll(set2));
        System.out.println(set1);

        // �Ӽ��� set1 ��ɾ���� set2 ��ͬ��Ƭ��
        set1.removeAll(set2);
        System.out.println(set1);


    }
}
