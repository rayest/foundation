package cn.rayest.array;

/**
 * Created by Rayest on 2016/8/28 0028.
 */
public class Reverse {
    public static void main(String[] args) {
        int[] data = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        reverse(data);
        printArray(data);
    }

    public static void reverse(int[] data) {
        int tmp;
        int head = 0;
        int tail = data.length - 1;
        for (int i = 0; i < data.length / 2; i++) {
            tmp = data[head];
            data[head] = data[tail];
            data[tail] = tmp;
            head++;
            tail--;
        }
    }

    public static void printArray(int[] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
    }
}
