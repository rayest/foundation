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
        // 1. û�н��н��봦��������Ϊ����
        FileChannel fc = new FileOutputStream("t2.dat").getChannel();
        fc.write(ByteBuffer.wrap("Some text".getBytes()));
        fc.close();

        fc = new FileInputStream("t2.dat").getChannel();
        ByteBuffer buffer = ByteBuffer.allocate(BSIZE);
        fc.read(buffer);
        buffer.flip();
        System.out.println(buffer.asCharBuffer());

        // 2. ָ�����뷽ʽΪϵͳĬ�ϵ��ַ���
        // rewind()�����ص������ʼ�ĵط�
        buffer.rewind();
        // �÷������ڷ���Ĭ���ַ��������������ַ������Ƶ��ַ���
        String encoding = System.getProperty("file.encoding");
        // ���÷�����մ����ַ������ַ����������� CharSet ���󣬸ö�����Զ��ַ������н���
        System.out.println(encoding + ": " + Charset.forName(encoding).decode(buffer));

        // 3. ָ�����뷽ʽΪ UTF-16BE
        fc = new FileOutputStream("t2.dat").getChannel();
        fc.write(ByteBuffer.wrap("some Text".getBytes("UTF-16BE")));
        fc.close();
        fc = new FileInputStream("t2.dat").getChannel();
        buffer.clear();
        fc.read(buffer);
        buffer.flip();
        System.out.println(buffer.asCharBuffer());

        // 4. ʹ�� CharBuffer
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
