package cn.rayest.io.byteIO;

import java.io.*;

/**
 * Created by Rayest on 2016/7/10 0010.
 */
public class CopyFile {
    public static void main(String[] args) {
        String srcPath = "f:/pic/pics/1.jpg";
        String desPath = "f:/pic/test/2.jpg";
        try {
            copyFile(srcPath, desPath);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("文件不存在！");
        }
    }

    public static void copyFile(String srcPath, String desPath)throws IOException {
        File src = new File(srcPath);
        File des = new File(desPath);
        copyFile(src, des);
    }

    public static void copyFile(File src, File des)throws IOException {
        if (!src.isFile()){
            System.out.println("只能拷贝文件");
        }
//        建立联系:源文件src    目的地des
//        选择流
        InputStream inputStream = new FileInputStream(src);
        OutputStream outputStream = new FileOutputStream(des);
//        文件拷贝,循环读取和写出
        byte[] flush = new byte[1024];
        int len = 0;
//        文件读取
        while ((len = inputStream.read(flush)) != (-1)){
//            文件写出
            outputStream.write(flush, 0, len);
        }
//        强制刷出
        outputStream.flush();

//        关闭两个流
        outputStream.close();
        inputStream.close();
    }
}
