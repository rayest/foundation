package cn.rayest.io.byteIO;

import cn.rayest.io.charIO.reader.BufferedInputFile;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;

/**
 * Created by Rayest on 2016/8/3 0003.
 */
public class FormattedMemoryInput {
    public static void main(String[] args) throws IOException {
        try {
            DataInputStream in = new DataInputStream(new ByteArrayInputStream(BufferedInputFile.read("MemoryInput.dat").getBytes()));
            while (true) {
                System.out.print((char) in.readByte());
            }
        } catch (EOFException e) {
            System.out.println("End of Stream");
        }

    }
}
