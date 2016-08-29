package cn.rayest.io.charIO;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * Created by Rayest on 2016/7/11 0011.
 */
public class printWriter {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter out = new PrintWriter("t1.txt");
        out.println("hello");
        out.close();
    }
}
