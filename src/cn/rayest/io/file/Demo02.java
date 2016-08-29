package cn.rayest.io.file;

import java.io.File;

/**
 * Created by Rayest on 2016/7/10 0010.
 */
public class Demo02 {
    public static void main(String[] args) {
        String parentPath = "F:/pictures";
        String name = "zxy5.jpg";
//      ���·��
//      1. ����һ
        File file = new File(parentPath, name);
        System.out.println(file.getName());
//      2. ������
        file = new File(new File(parentPath), name);
        System.out.println(file.getPath());

//        ����·��
        file = new File("F:/pictures/zxy5.jpg");
        System.out.println(file.getPath());
        System.out.println(file.getName());
//        û���̷�
        file = new File("test.txt");
        System.out.println(file.getName());
        System.out.println(file.getPath());
        System.out.println(file.getAbsolutePath());

    }
}
