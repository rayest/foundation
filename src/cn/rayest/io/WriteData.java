package cn.rayest.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * Created by Rayest on 2016/7/8 0008.
 */
public class WriteData {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("scores.txt");
        if (file.exists()){
            System.out.println("ÒÑ´æÔÚ£¡");
            System.exit(1);
        }

        PrintWriter output = new PrintWriter(file);
        output.print("lee ");
        output.println(90);
        output.print("Candy ");
        output.println(100);

        output.close();
    }
}
