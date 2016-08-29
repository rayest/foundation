package cn.rayest.io.byteIO;

import java.io.*;

/**
 * Created by Rayest on 2016/7/10 0010.
 */
public class Demo01{
    public static void main(String[] args) {
//        1.������ϵ
        File file = new File("f:/pic/test/1.txt");
//        ѡ����
        InputStream is = null; // ����������
        try {
            is = new FileInputStream(file);
//            ���������϶�ȡ��������
//            ÿ�ζ�ȡ1024�ֽ�
            byte[] car = new byte[1024];
            int len = 0;// ����ʵ�ʶ�ȡ��С
            try {
//                ѭ����ȡ�� -1������־
                while ((len = is.read(car)) != (-1)){
                    String info = new String(car, 0, len);
                    System.out.println(info);
                }
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("��ȡ�ļ�ʧ�ܣ�");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("�ļ������ڣ�");
        }finally{
            if (is != null){
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                    System.out.println("�ر��������ļ�ʧ��!");
                }
            }

        }

    }


}
