package cn.rayest.http.url;

import java.io.*;
import java.net.URL;

/**
 * Created by Rayest on 2016/9/20 0020.
 */
public class HttpURLConnection {
    // 通过 get 请求得到读取器响应数据的数据流
    public static InputStream getInputStreamByGet(String url) {
        try {
            java.net.HttpURLConnection connection = (java.net.HttpURLConnection) new URL(url).openConnection();
            connection.setReadTimeout(5000);
            connection.setConnectTimeout(5000);
            connection.setRequestMethod("GET");
            if (connection.getResponseCode() == java.net.HttpURLConnection.HTTP_OK) {
                InputStream inputStream = connection.getInputStream();
                return inputStream;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    // 将服务器响应的数据流保存到本地文件
    public static void saveData(InputStream inputStream, File file) {
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);

            byte[] buffer = new byte[1024];
            int length = -1;
            while ((length = bufferedInputStream.read(buffer)) != -1) {
                bufferedOutputStream.write(buffer, 0, length);
                bufferedOutputStream.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
