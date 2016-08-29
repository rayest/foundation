package cn.rayest.io.byteIO;

import java.io.*;

/**
 * Created by Rayest on 2016/8/3 0003.
 */
public class TestEOF {
    public static void main(String[] args) throws IOException {
        DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream("MemoryInput.dat")));
        // available() 方法用于检查可供存取的字符多少，返回的值的类型是 基本整型 int 型
        while (in.available() != 0){
            // DataInputStream 实例对象的 readByte() 方法用于读取文件内容，每次读取一个字节并将其返回
            System.out.print((char) in.readByte());
        }
    }
}
