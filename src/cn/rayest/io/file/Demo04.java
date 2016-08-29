package cn.rayest.io.file;

import java.io.File;

/**
 * Created by Rayest on 2016/7/10 0010.
 */
public class Demo04 {
    public static void main(String[] args) {

        Demo04.test2();
    }
    public static void test1(){
        String path = "F:/pic/test";
        File file = new File(path);
        file.mkdir();
    }

    public static void test2(){
        String path = "f:/pic/test";
        File file = new File(path);
        if (file.isDirectory()){
            String[] subNames = file.list();
            for (String temp: subNames){
                System.out.println(temp);
            }
        }
    }

    public static void test3(){

    }

}
