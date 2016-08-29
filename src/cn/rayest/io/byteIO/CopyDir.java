package cn.rayest.io.byteIO;

import java.io.File;

/**
 * Created by Rayest on 2016/7/10 0010.
 */
public class CopyDir {
    public static void main(String[] args) {
        String srcPath = "f:/pic/test";
        String desPath = "f:/pic/test/stars";

        File src = new File(srcPath);
        File des = new File(desPath);

        if (src.isDirectory()){
            des = new File(desPath, src.getName());
        }

        copyDir(src, des);

    }

    public static void copyDir(File src, File des){
        if (src.isFile()){

        }
    }
}
