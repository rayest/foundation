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
            1. String ��� getBytes() �������Խ�ָ�����ַ���ת��Ϊ�ֽ�����
            2. wrap() �������ֽ������װ�� ByteBuffer ��
        */
        fc.write(ByteBuffer.wrap("Some text ".getBytes()));
        fc.close();

        fc = new RandomAccessFile("t2.dat", "rw").getChannel();

        /*
            1. ���ļ��ڿ����洦�ƶ� FileChannel
            2. ͨ�� fc.position() �������� FileChannel �Ƶ��ļ�����ļ��� fc.size() �����Ա���ļ�׷��������д�����
        */
        fc.position(fc.size());
        fc.write(ByteBuffer.wrap("Some more".getBytes()));
        fc.close();


        fc = new FileInputStream("t2.dat").getChannel();
        // ���� ByteBuffer �� allocate() ��̬�����������ڴ���䣬��СΪ BSIZE
        ByteBuffer buffer = ByteBuffer.allocate(BSIZE);
        // ���� read ������
        fc.read(buffer);
        buffer.flip();

        // ÿ��ֻ��ȡ buffer ��һ���ֽڣ�������ǿ������ת��Ϊ char �ͺ����
        while (buffer.hasRemaining()){
            System.out.print((char) buffer.get());
        }
    }
}
