package cn.rayest.io.charIO.writer;

import cn.rayest.io.charIO.reader.BufferedInputFile;

import java.io.*;

/**
 * Created by Rayest on 2016/8/3 0003.
 */
public class BasicFileOutput {
    // 初始化一个指定名称的 file 文件
    static String file = "BasicFileOutput.out";
    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new StringReader(BufferedInputFile.read("Lee.dat")));

        /*
            FileWriter 对象用于向指定文件写入数据，一般先将其用 BufferedWriter 类包装起来以进行缓存输出
            缓存可以增强 I/O 流的操作性能
        */

        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(file)));

        int countLine = 1;
        String s;
        // 将每次数据读取结果赋予 String对象，如果读取的结果不为 null，继续读取下一行数据
        while ((s = in.readLine()) != null){
            // out 对象将结果写入文件中
            out.println(countLine++ +": " + s);
        }
        out.close();
        // 输出文件内容
        System.out.println(BufferedInputFile.read(file));
    }
}
