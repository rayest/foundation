package cn.rayest.io.file;

import java.io.File;

/**
 * 1. 路径分隔符
 * 2. 名称分隔符 \: Windows 的， /: Linux 等的
 * Created by Rayest on 2016/7/10 0010.
 */
public class Demo01 {
    public static void main(String[] args) {
//        1. 路径分隔符 ;
        System.out.println(File.pathSeparator);
//        2. 名称分隔符 \
        System.out.println(File.separator);

    }
}
