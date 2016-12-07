package cn.rayest.java8.chap3.around;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * Created by Rayest on 2016/12/7 0007.
 */
public interface BufferedReaderProcessor {
    String process(BufferedReader bufferedReader) throws IOException;
}
