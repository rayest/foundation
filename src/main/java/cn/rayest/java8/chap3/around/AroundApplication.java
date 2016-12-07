package cn.rayest.java8.chap3.around;

import java.io.BufferedReader;
import java.io.IOException;

import static cn.rayest.java8.chap3.around.Around.processFile;
import static cn.rayest.java8.chap3.around.Around.processFileLimited;

/**
 * Created by Rayest on 2016/12/7 0007.
 */
public class AroundApplication {
    public static void main(String[] args) throws IOException {
        //
        String result = processFileLimited();
        System.out.println(result);

        //
        String oneLine = processFile((BufferedReader b) -> b.readLine());
        System.out.println(oneLine);

        //
        String twoLine = processFile((BufferedReader b) -> b.readLine() + b.readLine());
        System.out.println(twoLine);
    }
}
