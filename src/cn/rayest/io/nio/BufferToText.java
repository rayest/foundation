package cn.rayest.io.nio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;

/**
 * Created by Rayest on 2016/8/4 0004.
 */
public class BufferToText {
    private static final int BSIZE = 1024;

    public static void main(String[] args) throws IOException {
        // 1. 没有进行解码处理，输出结果为乱码
        FileChannel fc = new FileOutputStream("t2.dat").getChannel();
        fc.write(ByteBuffer.wrap("Some text".getBytes()));
        fc.close();

        fc = new FileInputStream("t2.dat").getChannel();
        ByteBuffer buffer = ByteBuffer.allocate(BSIZE);
        fc.read(buffer);
        buffer.flip();
        System.out.println(buffer.asCharBuffer());

        // 2. 指定解码方式为系统默认的字符集
        // rewind()：返回到数据最开始的地方
        buffer.rewind();
        // 该方法用于发现默认字符集，产生代表字符集名称的字符串
        String encoding = System.getProperty("file.encoding");
        // 利用反射接收代表字符集的字符串，并产生 CharSet 对象，该对象可以对字符串进行解码
        System.out.println(encoding + ": " + Charset.forName(encoding).decode(buffer));

        // 3. 指定解码方式为 UTF-16BE
        fc = new FileOutputStream("t2.dat").getChannel();
        fc.write(ByteBuffer.wrap("some Text".getBytes("UTF-16BE")));
        fc.close();
        fc = new FileInputStream("t2.dat").getChannel();
        buffer.clear();
        fc.read(buffer);
        buffer.flip();
        System.out.println(buffer.asCharBuffer());

        // 4. 使用 CharBuffer
        fc = new FileOutputStream("t2.dat").getChannel();
        buffer = ByteBuffer.allocate(24);
        buffer.asCharBuffer().put("Some text");
        fc.write(buffer);
        fc.close();
        fc = new FileInputStream("t2.dat").getChannel();
        buffer.clear();
        fc.read(buffer);
        buffer.flip();
        System.out.println(buffer.asCharBuffer());

    }
}
