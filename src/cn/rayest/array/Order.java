package cn.rayest.array;

import java.util.Arrays;

/**
 * Created by Rayest on 2016/8/28 0028.
 */
public class Order {
    public static void main(String[] args) {
        int[] data = new int[]{1, 9, 3, 4, 6, 2, 0, 8, 7, 5};
        orderArray(data);
        printArray(data);
        System.out.println();
        Arrays.sort(data);
        printArray(data);
    }

    public static void orderArray(int[] data) {
        for (int i = 0; i < data.length - 1; i++) { // 循环次数
            for (int j = 0; j < data.length - 1; j++) { // 比较次数
                int tmp;
                if (data[j] > data[j + 1]) {
                    tmp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = tmp;
                }
            }
        }
    }

    public static void printArray(int[] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
    }
}
