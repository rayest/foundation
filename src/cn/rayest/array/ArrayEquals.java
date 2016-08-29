package cn.rayest.array;

import java.util.Arrays;

/**
 * Created by Rayest on 2016/8/2 0002.
 */
public class ArrayEquals {
    public static void main(String[] args) {

        int[] a = new int[5];
        int[] b = new int[5];
        // Arrays 类的 fill() 方法
        Arrays.fill(a, 47);
        Arrays.fill(b, 47);
        // Arrays 类的 equals() 方法
        System.out.println(Arrays.equals(a, b));

        String[] s1 = new String[4];
        Arrays.fill(s1, "Pay");
        String[] s2 = {new String("Pay"), new String("Pay"), new String("Pay"), new String("Pay")};
        System.out.println(Arrays.equals(s1, s2));

    }
}
