package cn.rayest.io.file;

import java.io.File;
import java.io.IOException;

/**
 * Created by Rayest on 2016/7/10 0010.
 */
public class Demo03 {
    public static void main(String[] args) throws IOException {
        String path = "f:/pic/pics/001.jpg";
        File file = new File(path);
        if (!file.exists()){
            file.createNewFile();
        }
    }
}
