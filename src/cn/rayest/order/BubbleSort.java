package cn.rayest.order;

import java.util.Arrays;

/**
 * Created by Rayest on 2016/7/15 0015.
 */
public class BubbleSort {
    public static void main(String[] args) {

        int[] numbers = {1, 3, 5, 7, 9, 0, 8, 6, 4, 2, 10, -5};
        int temp;

        // 1. n �����������򣬱��� n-1 �Σ�ÿ�α����󣬽ϴ����õ���ȷ�������ں���
        for (int n = 1; n < numbers.length; n++) {
            // 2.�ӵ�һ������ʼ��ֱ�������ڶ���������Щ����Ҫ����һ�������бȽ�
            for (int i = 0; i < numbers.length - n; i++) {
                // 3. ÿ�αȽϵ�����һ������õ� ���ڵ�����Ԫ��
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
