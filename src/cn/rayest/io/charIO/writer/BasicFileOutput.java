package cn.rayest.io.charIO.writer;

import cn.rayest.io.charIO.reader.BufferedInputFile;

import java.io.*;

/**
 * Created by Rayest on 2016/8/3 0003.
 */
public class BasicFileOutput {
    // ��ʼ��һ��ָ�����Ƶ� file �ļ�
    static String file = "BasicFileOutput.out";
    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new StringReader(BufferedInputFile.read("Lee.dat")));

        /*
            FileWriter ����������ָ���ļ�д�����ݣ�һ���Ƚ����� BufferedWriter ���װ�����Խ��л������
            ���������ǿ I/O ���Ĳ�������
        */

        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(file)));

        int countLine = 1;
        String s;
        // ��ÿ�����ݶ�ȡ������� String���������ȡ�Ľ����Ϊ null��������ȡ��һ������
        while ((s = in.readLine()) != null){
            // out ���󽫽��д���ļ���
            out.println(countLine++ +": " + s);
        }
        out.close();
        // ����ļ�����
        System.out.println(BufferedInputFile.read(file));
    }
}
