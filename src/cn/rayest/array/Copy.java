package cn.rayest.array;

/**
 * Created by Rayest on 2016/8/28 0028.
 */
public class Copy {
    public static void main(String[] args) {
        int[] array1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] array2 = new int[]{10, 20, 30, 40, 50, 60, 70, 80, 90};
        System.arraycopy(array1, 3, array2, 3, 5);
        printArray(array2);
    }
    public static void printArray(int[] data){
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
    }

}
