package cn.rayest.io.byteIO;

import java.io.*;

/**
 * Created by Rayest on 2016/8/3 0003.
 */
public class TestEOF {
    public static void main(String[] args) throws IOException {
        DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream("MemoryInput.dat")));
        // available() �������ڼ��ɹ���ȡ���ַ����٣����ص�ֵ�������� �������� int ��
        while (in.available() != 0){
            // DataInputStream ʵ������� readByte() �������ڶ�ȡ�ļ����ݣ�ÿ�ζ�ȡһ���ֽڲ����䷵��
            System.out.print((char) in.readByte());
        }
    }
}
