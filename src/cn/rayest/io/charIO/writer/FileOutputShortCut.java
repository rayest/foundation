package cn.rayest.io.charIO.writer;

import cn.rayest.io.charIO.reader.BufferedInputFile;

import java.io.*;

/**
 * Created by Rayest on 2016/8/4 0004.
 */
public class FileOutputShortCut {
    static String file = "FileOutputShortCut.out";

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new StringReader(BufferedInputFile.read("Lee.dat")));
        PrintWriter out = new PrintWriter(file);
        String s;
        int countLine = 1;
        while ((s = in.readLine()) != null){
            out.println(countLine++ + ": " + s);
        }
        out.close();
        System.out.println(BufferedInputFile.read(file));
    }
}
