package cn.rayest.array;

import java.util.Arrays;

/**
 * Created by Rayest on 2016/8/2 0002.
 */
public class AssembleDimensionArrays {
    public static void main(String[] args) {
        Integer[][] a = new Integer[4][4];
        // 二维数组的长度是数组的行数，
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = i * j;
            }
        }
        System.out.println(Arrays.deepToString(a));
    }
}
