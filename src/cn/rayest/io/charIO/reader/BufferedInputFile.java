package cn.rayest.io.charIO.reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Rayest on 2016/8/3 0003.
 */
public class BufferedInputFile {
    // read() 方法传入的是一个具体的文件，而不是文件路径
    public static String read(String fileName) throws IOException {
        /*
            从本地磁盘读取该文件
            StringReader extends Reader
        */

        BufferedReader input = new BufferedReader(new FileReader(fileName));
        String s;
        StringBuffer sb = new StringBuffer();
        while ((s = input.readLine()) != null){
            sb.append(s + "\n");
        }
        input.close();
        return sb.toString();
    }

    public static void main(String[] args) throws IOException {

        System.out.println(read("Lee.dat"));
    }
}
