package cn.rayest.java8.chap3.around;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Rayest on 2016/12/7 0007.
 */
public class Around {
    public static String processFile(BufferedReaderProcessor processor) throws IOException {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("chap3/data.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return processor.process(reader);
    }

    public static String processFileLimited() throws IOException {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("chap3/data.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return reader.readLine();
    }


}
