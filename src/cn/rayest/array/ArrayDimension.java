package cn.rayest.array;

/**
 * Created by Rayest on 2016/8/2 0002.
 */
public class ArrayDimension {
    public static void main(String[] args) {
        int[][] data = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        // 1. 先把数组倒置
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j <= i; j++) {
                if (i != j) {
                    int tmp;
                    tmp = data[i][j];
                    data[i][j] = data[j][i];
                    data[j][i] = tmp;
                }
            }
        }

        // 2. 输出倒置后的数组
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }
}
