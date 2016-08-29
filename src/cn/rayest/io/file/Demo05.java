package cn.rayest.io.file;

import java.io.File;

/**
 * 输出子孙级目录|文件的名称
 * 1.listFiles()
 * 2.递归
 * Created by Rayest on 2016/7/10 0010.
 */
public class Demo05 {
    public static void main(String[] args) {
        String path = "f:/pic";
        File parent = new File(path);
        printName(parent);
    }

    public static void printName(File file){
        if (file == null || !file.exists()){
            return;
        }

        System.out.println(file.getAbsolutePath());

        if (file.isDirectory()) {
            for (File sub: file.listFiles()){
                printName(sub);
            }
        }
    }
}
