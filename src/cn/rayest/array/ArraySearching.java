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
            // 随机产生一个整数 r
            int r = gen.next();
            /*
                在使用 binarySearch()二分查找法之前，需要将原数组进行排序：sort()
                使用 Arrays 类的二分查找法 binarySearch()，从数组 a 中查找元素 r
                返回的值表明是否找到目标元素
                返回值 >= 0：表明已找到，且返回值的大小即是元素在数组中的位置
                返回值 < 0：表明未找到目标值
            */

            int location = Arrays.binarySearch(a, r);
            if (location >= 0) {
                print(r + ": " + location);
                break;
            }

        }
    }
}
