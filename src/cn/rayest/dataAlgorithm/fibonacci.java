package cn.rayest.dataAlgorithm;

/**
 * Created by Rayest on 2016/8/8 0008.
 */

// 쳲��������У�0, 1, 1, 2, 3, 5, 8, 13, 21, ...
public class Fibonacci {
    public static void main(String[] args) {
        int i;
        int[] array = new int[40];
        array[0] = 0;
        array[1] = 1;
        System.out.println("�� 1 ��쳲�������: " + array[0]);
        System.out.println("�� 2 ��쳲�������: " + array[1]);
        for (i = 2; i < 40; i++) {
            array[i] = array[i - 1] + array[i - 2];
            System.out.println("�� " + (i + 1) + " ��쳲�������: " + array[i]);
        }

    }
}
