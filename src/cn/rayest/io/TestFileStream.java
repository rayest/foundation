package cn.rayest.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by Rayest on 2016/7/8 0008.
 */
public class TestFileStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream output = new FileOutputStream("temp.dat");
        for (int i = 0; i <= 10 ; i++) {
            output.write(i);
        }
        output.close();

        FileInputStream input = new FileInputStream("temp.dat");
        int value;
        while ((value = input.read()) != -1){
            System.out.println(value);
        }
        input.close();

        /*
            其实，System.out 对象和 System.err 对象已经被事先包装成了 PrintStream 对象
            而 System.in 则是未经包装的 InputStream 对象
        */


    }
}
