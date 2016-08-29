package cn.rayest.io.standardIO;

import java.io.*;

/**
 * Created by Rayest on 2016/8/4 0004.
 */
public class Redirecting {
    public static void main(String[] args) throws IOException {

        PrintStream console = System.out;
        // 将 Lee.dat 文件的数据写入到 t2.dat 文件中，
        BufferedInputStream in = new BufferedInputStream(new FileInputStream("Lee.dat"));
        PrintStream out = new PrintStream(new BufferedOutputStream(new FileOutputStream("t2.dat")));

        System.setIn(in);
        System.setOut(out);
        System.setErr(out);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while ((s = br.readLine()) != null){
            System.out.println(s);
        }
        out.close();
        System.setOut(console);
    }
}
