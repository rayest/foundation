package cn.rayest.io.fileOutputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by Rayest on 2016/7/11 0011.
 */
public class Demo01 {
    public static void main(String[] args) throws IOException {

        FileOutputStream output = new FileOutputStream("t2.dat");

        for (int i = 0; i < 10; i++) {
            try {
                output.write(i);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        output.close();

        FileInputStream input = new FileInputStream("t2.dat");
        try {
            int value;
            while ((value = input.read()) != (-1)){
                System.out.println(value);
           }
        }catch (IOException e) {
            e.printStackTrace();
        }
        input.close();

    }
}
