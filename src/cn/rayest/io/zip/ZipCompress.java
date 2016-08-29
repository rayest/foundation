package cn.rayest.io.zip;

import java.io.*;
import java.util.Enumeration;
import java.util.zip.*;

/**
 * Created by Rayest on 2016/8/4 0004.
 */
public class ZipCompress {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOut = new FileOutputStream("test.zip");
        CheckedOutputStream checkedOut = new CheckedOutputStream(fileOut, new Adler32());
        ZipOutputStream zipOut = new ZipOutputStream(checkedOut);
        BufferedOutputStream out = new BufferedOutputStream(zipOut);
        zipOut.setComment("A test of Java Zipping");
        for (String arg : args){
            System.out.println(arg);
            BufferedReader in = new BufferedReader(new FileReader(arg));
            zipOut.putNextEntry(new ZipEntry(arg));
            int c;
            while ((c = in.read()) != -1){
                out.write(c);
            }
            in.close();
            out.flush();
        }
        out.close();
        System.out.println(checkedOut.getChecksum().getValue());


        FileInputStream fileInputStream = new FileInputStream("test.zip");
        CheckedInputStream checkedInput = new CheckedInputStream(fileInputStream, new Adler32());
        ZipInputStream zipInput = new ZipInputStream(checkedInput);
        BufferedInputStream bufferedInput = new BufferedInputStream(zipInput);
        ZipEntry zipEntry;
        while ((zipEntry = zipInput.getNextEntry()) != null){
            System.out.println(zipEntry);
            int x;
            while ((x = bufferedInput.read()) != -1){
                System.out.println(x);
            }
        }
        if (args.length == 1){
            System.out.println(checkedInput.getChecksum().getValue());
        }
        bufferedInput.close();


        ZipFile zipFile = new ZipFile("test.zip");
        Enumeration e = zipFile.entries();
        while (e.hasMoreElements()){
            ZipEntry zipEntry2 = (ZipEntry) e.nextElement();
            System.out.println("File: " + zipEntry2);
        }

    }
}
