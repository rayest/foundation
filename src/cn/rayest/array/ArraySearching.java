package cn.rayest.array;

import net.mindview.util.ConvertTo;
import net.mindview.util.Generated;
import net.mindview.util.Generator;
import net.mindview.util.RandomGenerator;

import java.util.Arrays;

import static net.mindview.util.Print.print;

/**
 * Created by Rayest on 2016/8/2 0002.
 */
public class ArraySearching {
    public static void main(String[] args) {
        Generator<Integer> gen = new RandomGenerator.Integer(1000);
        int[] a = ConvertTo.primitive(Generated.array(new Integer[25], gen));
        print(Arrays.toString(a));
        Arrays.sort(a);
        print(Arrays.toString(a));

        while (true) {
            // �������һ������ r
            int r = gen.next();
            /*
                ��ʹ�� binarySearch()���ֲ��ҷ�֮ǰ����Ҫ��ԭ�����������sort()
                ʹ�� Arrays ��Ķ��ֲ��ҷ� binarySearch()�������� a �в���Ԫ�� r
                ���ص�ֵ�����Ƿ��ҵ�Ŀ��Ԫ��
                ����ֵ >= 0���������ҵ����ҷ���ֵ�Ĵ�С����Ԫ���������е�λ��
                ����ֵ < 0������δ�ҵ�Ŀ��ֵ
            */

            int location = Arrays.binarySearch(a, r);
            if (location >= 0) {
                print(r + ": " + location);
                break;
            }

        }
    }
}
