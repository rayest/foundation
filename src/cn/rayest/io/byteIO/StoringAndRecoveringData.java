package cn.rayest.io.byteIO;

import java.io.*;

/**
 * Created by Rayest on 2016/8/4 0004.
 */
public class StoringAndRecoveringData {

    public static void main(String[] args) throws IOException {


        DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("Data.txt")));
        out.writeDouble(3.1415926);
        out.writeUTF("That was PI");
        out.writeDouble(1.41413);
        out.writeUTF("That was square root of 2");
        out.close();

        DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream("Data.txt")));
        System.out.println(in.readDouble());
        System.out.println(in.readUTF());
        System.out.println(in.readDouble());
        System.out.println(in.readUTF());

    }
}
