package cn.rayest.io.fileOutputStream;

import java.io.*;

/**
 * Created by Rayest on 2016/7/11 0011.
 */
public class Demo02 {
    public static void main(String[] args) throws FileNotFoundException {
        DataOutputStream output = new DataOutputStream(new FileOutputStream("t3.dat"));
        try {
            output.writeUTF("ray");
            output.writeDouble(75.2);

            output.writeUTF("Candy");
            output.writeDouble(54.2);

            output.writeUTF("Pay");
            output.writeDouble(668.2);

        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            output.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        DataInputStream input =new DataInputStream(new FileInputStream("t3.dat"));
        try {
            System.out.println( input.readUTF() + " " + input.readDouble());
            System.out.println( input.readUTF() + " " + input.readDouble());
            System.out.println( input.readUTF() + " " + input.readDouble());
          } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            input.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
