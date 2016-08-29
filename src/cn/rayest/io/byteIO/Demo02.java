package cn.rayest.io.byteIO;

import java.io.*;

/**
 * Created by Rayest on 2016/7/10 0010.
 */
public class Demo02 {
    public static void main(String[] args) {
        File file = new File("f:/pic/test/1.txt");
        OutputStream outputStream = null;
        try {
//            追加形式为true，否则为覆盖
            outputStream = new FileOutputStream(file, true);
            String string = "好诗！";
            byte[] data = string.getBytes();
            try {
                outputStream.write(data, 0, data.length);
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                outputStream.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("文件未找到");
        }
    }
}
