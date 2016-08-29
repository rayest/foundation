package cn.rayest.array;

import java.util.Arrays;

/**
 * Created by Rayest on 2016/8/2 0002.
 */
public class ArrayEquals {
    public static void main(String[] args) {

        int[] a = new int[5];
        int[] b = new int[5];
        // Arrays ��� fill() ����
        Arrays.fill(a, 47);
        Arrays.fill(b, 47);
        // Arrays ��� equals() ����
        System.out.println(Arrays.equals(a, b));

        String[] s1 = new String[4];
        Arrays.fill(s1, "Pay");
        String[] s2 = {new String("Pay"), new String("Pay"), new String("Pay"), new String("Pay")};
        System.out.println(Arrays.equals(s1, s2));

    }
}
