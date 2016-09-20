package cn.rayest.http.url;

import org.junit.Test;

import java.io.File;
import java.io.InputStream;

/**
 * Created by Rayest on 2016/9/20 0020.
 */
public class HttpURLConnectionTest {
    @Test
    public void testGetURLInfo() throws Exception {
        String url = "http://www.tooopen.com/view/1274806.html"; // 待下载内容的 url 地址
        String[] splitURL = url.split("/");
        String fileName = splitURL[splitURL.length - 1];
        File file = new File("F:/", fileName);
        InputStream inputStream = HttpURLConnection.getInputStreamByGet(url);
        HttpURLConnection.saveData(inputStream, file);
    }
}
