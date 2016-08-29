package cn.rayest.order;

import java.util.Arrays;

/**
 * Created by Rayest on 2016/7/15 0015.
 */
public class BubbleSort {
    public static void main(String[] args) {

        int[] numbers = {1, 3, 5, 7, 9, 0, 8, 6, 4, 2, 10, -5};
        int temp;

        // 1. n 个数进行排序，遍历 n-1 次；每次遍历后，较大数得到正确排序，排在后面
        for (int n = 1; n < numbers.length; n++) {
            // 2.从第一个数开始，直至倒数第二个数，这些数都要与下一个数进行比较
            for (int i = 0; i < numbers.length - n; i++) {
                // 3. 每次比较的是上一步排序好的 相邻的两个元素
                if (numbers[i] > numbers[i + 1]){
                    temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}
