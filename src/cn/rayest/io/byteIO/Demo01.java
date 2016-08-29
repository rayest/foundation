package cn.rayest.io.byteIO;

import java.io.*;

/**
 * Created by Rayest on 2016/7/10 0010.
 */
public class Demo01{
    public static void main(String[] args) {
//        1.建立联系
        File file = new File("f:/pic/test/1.txt");
//        选择流
        InputStream is = null; // 提升作用域
        try {
            is = new FileInputStream(file);
//            操作：不断读取缓冲数组
//            每次读取1024字节
            byte[] car = new byte[1024];
            int len = 0;// 接受实际读取大小
            try {
//                循环读取， -1结束标志
                while ((len = is.read(car)) != (-1)){
                    String info = new String(car, 0, len);
                    System.out.println(info);
                }
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("读取文件失败！");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("文件不存在！");
        }finally{
            if (is != null){
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                    System.out.println("关闭输入流文件失败!");
                }
            }

        }

    }


}
