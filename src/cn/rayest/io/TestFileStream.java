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
            ��ʵ��System.out ����� System.err �����Ѿ������Ȱ�װ���� PrintStream ����
            �� System.in ����δ����װ�� InputStream ����
        */


    }
}
