package cn.rayest.io;

import java.io.File;
/**
 * Created by Rayest on 2016/7/8 0008.
 */
public class TestFileClass {
    public static void main(String[] args) {
        File file = new File("file/Welcome.java");
        System.out.println(file.getAbsolutePath());
        System.out.println(file.exists());
    }
}
