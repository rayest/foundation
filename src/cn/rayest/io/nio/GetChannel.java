package cn.rayest.io.nio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Created by Rayest on 2016/8/4 0004.
 */
public class GetChannel {
    private static final int BSIZE = 1024;

    public static void main(String[] args) throws IOException {

        FileChannel fc = new FileOutputStream("t2.dat").getChannel();

        /*
            1. String 类的 getBytes() 方法可以将指定的字符串转换为字节数组
            2. wrap() 方法将字节数组包装到 ByteBuffer 中
        */
        fc.write(ByteBuffer.wrap("Some text ".getBytes()));
        fc.close();

        fc = new RandomAccessFile("t2.dat", "rw").getChannel();

        /*
            1. 在文件内可以随处移动 FileChannel
            2. 通过 fc.position() 方法，将 FileChannel 移到文件最后即文件的 fc.size() 处，以便对文件追加其他的写入操作
        */
        fc.position(fc.size());
        fc.write(ByteBuffer.wrap("Some more".getBytes()));
        fc.close();


        fc = new FileInputStream("t2.dat").getChannel();
        // 调用 ByteBuffer 的 allocate() 静态方法，进行内存分配，大小为 BSIZE
        ByteBuffer buffer = ByteBuffer.allocate(BSIZE);
        // 调用 read 方法，
        fc.read(buffer);
        buffer.flip();

        // 每次只读取 buffer 的一个字节，并将其强制类型转换为 char 型后输出
        while (buffer.hasRemaining()){
            System.out.print((char) buffer.get());
        }
    }
}
