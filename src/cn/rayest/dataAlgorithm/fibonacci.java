package cn.rayest.dataAlgorithm;

/**
 * Created by Rayest on 2016/8/8 0008.
 */

// 斐波那契数列：0, 1, 1, 2, 3, 5, 8, 13, 21, ...
public class Fibonacci {
    public static void main(String[] args) {
        int i;
        int[] array = new int[40];
        array[0] = 0;
        array[1] = 1;
        System.out.println("第 1 个斐波那契数: " + array[0]);
        System.out.println("第 2 个斐波那契数: " + array[1]);
        for (i = 2; i < 40; i++) {
            array[i] = array[i - 1] + array[i - 2];
            System.out.println("第 " + (i + 1) + " 个斐波那契数: " + array[i]);
        }

    }
}
