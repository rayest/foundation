package cn.rayest.io.standardIO;

import java.io.PrintWriter;

/**
 * Created by Rayest on 2016/8/4 0004.
 */
public class ChangeSystemOut {
    public static void main(String[] args) {
        PrintWriter out = new PrintWriter(System.out, true);
        out.println("Hello, Pay");
    }
}
