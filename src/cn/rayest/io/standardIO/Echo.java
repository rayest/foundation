package cn.rayest.io.standardIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Rayest on 2016/8/4 0004.
 */
public class Echo {
    public static void main(String[] args) throws IOException {
        // stdin 对象读取用户输入 System.in 的值
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while ((s = stdin.readLine()) != null && s.length() != 0){
            System.out.println(s);
        }
    }
}
