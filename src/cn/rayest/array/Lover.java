package cn.rayest.array;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Rayest on 2016/8/2 0002.
 */
public class Lover {
    public static void main(String[] args) {
        for (int i = 0; i < 7; i++) {
            System.out.println(Arrays.toString(loverSet(3)));
        }
    }

    private static Random random = new Random(47);
    static final String[] LOVERS = {"Pay", "Candy", "Paris", "Ray", "Sweety", "Rayest", "Tian"};

    public static String[] loverSet(int n) {
        if (n > LOVERS.length) {
            throw new IllegalArgumentException("Set too big");
        }
        String[] result = new String[n];
        boolean[] picked = new boolean[LOVERS.length];
        for (int i = 0; i < n; i++) {
            int t;
            do {
                t = random.nextInt(LOVERS.length);
            }
            while (picked[t]);
            result[i] = LOVERS[t];
            picked[t] = true;
        }
        return result;
    }
}
