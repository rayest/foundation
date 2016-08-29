package cn.rayest.io.nio;

import java.nio.ByteBuffer;

/**
 * Created by Rayest on 2016/8/4 0004.
 */
public class GetData {
    private static final int BSIZE = 1024;

    public static void main(String[] args) {
        // 分配器自动将缓冲器的内容置为 0，共 1024 个
        ByteBuffer bb = ByteBuffer.allocate(BSIZE);
        // 1. 检测缓冲器被分配的大小
        int i = 0;
        // limit() 决定要检测的范围
        while (i++ < bb.limit()) {
            // 如果检测到的值不为零，则输出 nonzero
            if (bb.get() != 0) {
                System.out.println("nonzero");
            }
        }
        System.out.println(i);
        bb.rewind();

        //2. 存入并读取一个字符数组
        bb.asCharBuffer().put("CandyPay");
        // System.out.println(bb.getChar());
        char c;
        while ((c = bb.getChar()) != 0) {
            System.out.print(c + " ");
        }
        System.out.println();
        bb.rewind();

        // 3. 存入并读取一个 short
        bb.asShortBuffer().put((short) 471124);
        System.out.println(bb.getShort());
        bb.rewind();

        // 4. 存入并读取一个 long
        bb.asLongBuffer().put(963852741);
        System.out.println(bb.getLong());
        bb.rewind();

        // 5.存入并读取一个 int
        bb.asIntBuffer().put(123456);
        System.out.println(bb.getInt());
        bb.rewind();

        // 6.存入并读取一个 float
        bb.asFloatBuffer().put(123456789);
        System.out.println(bb.getFloat());
        bb.rewind();

        // 7.存入并读取一个 double
        bb.asDoubleBuffer().put(123456789);
        System.out.println(bb.getDouble());
        bb.rewind();


    }
}