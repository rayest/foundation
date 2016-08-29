package cn.rayest.io.charIO;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * Created by Rayest on 2016/7/10 0010.
 */
public class Demo01 {
    public static void main(String[] args) {
//       ����Դ
        File src = new File("F:/pic/test/1.txt");
//        ѡ����
        Reader reader = null;
        try {
            reader = new FileReader(src);
            char[] flush = new char[10];
            int len = 0;
            while ((len = reader.read(flush)) != (-1)){
    //            �ַ�����ת�����ַ���
                String string = new String(flush, 0, len);
                System.out.println(string);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (null != reader){
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
