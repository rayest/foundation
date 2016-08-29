package cn.rayest.io.charIO.reader;

import java.io.IOException;
import java.io.StringReader;

/**
 * Created by Rayest on 2016/8/3 0003.
 */
public class MemoryInput {
    public static void main(String[] args) throws IOException {

        // StringReader extends Reader
        StringReader in = new StringReader(BufferedInputFile.read("MemoryInput.dat"));
        int c;
        while ((c = in.read()) != -1){
            System.out.print((char) c);
        }
    }
}
