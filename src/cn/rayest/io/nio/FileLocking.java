package cn.rayest.io.nio;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileLock;
import java.util.concurrent.TimeUnit;

/**
 * Created by Rayest on 2016/8/4 0004.
 */
public class FileLocking {
    public static void main(String[] args) throws IOException, InterruptedException {
        FileOutputStream out = new FileOutputStream("Lee.dat");
        // 调用 tryLock() 无参方法，可以对整个文件加锁
        FileLock fileLock = out.getChannel().tryLock();
        if (fileLock != null){
            System.out.println("Locked File");
            TimeUnit.MILLISECONDS.sleep(5000);
            // 释放锁
            fileLock.release();
            System.out.println("Released Lock");
        }
    }
}
