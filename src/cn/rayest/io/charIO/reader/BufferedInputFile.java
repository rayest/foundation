package cn.rayest.io.charIO.reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Rayest on 2016/8/3 0003.
 */
public class BufferedInputFile {
    // read() �����������һ��������ļ����������ļ�·��
    public static String read(String fileName) throws IOException {
        /*
            �ӱ��ش��̶�ȡ���ļ�
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
