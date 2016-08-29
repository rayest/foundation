package cn.rayest.io.byteIO;

import java.io.*;

/**
 * Created by Rayest on 2016/7/10 0010.
 */
public class CopyFile {
    public static void main(String[] args) {
        String srcPath = "f:/pic/pics/1.jpg";
        String desPath = "f:/pic/test/2.jpg";
        try {
            copyFile(srcPath, desPath);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("�ļ������ڣ�");
        }
    }

    public static void copyFile(String srcPath, String desPath)throws IOException {
        File src = new File(srcPath);
        File des = new File(desPath);
        copyFile(src, des);
    }

    public static void copyFile(File src, File des)throws IOException {
        if (!src.isFile()){
            System.out.println("ֻ�ܿ����ļ�");
        }
//        ������ϵ:Դ�ļ�src    Ŀ�ĵ�des
//        ѡ����
        InputStream inputStream = new FileInputStream(src);
        OutputStream outputStream = new FileOutputStream(des);
//        �ļ�����,ѭ����ȡ��д��
        byte[] flush = new byte[1024];
        int len = 0;
//        �ļ���ȡ
        while ((len = inputStream.read(flush)) != (-1)){
//            �ļ�д��
            outputStream.write(flush, 0, len);
        }
//        ǿ��ˢ��
        outputStream.flush();

//        �ر�������
        outputStream.close();
        inputStream.close();
    }
}
