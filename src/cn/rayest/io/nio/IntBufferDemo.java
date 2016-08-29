package cn.rayest.io.nio;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;

/**
 * Created by Rayest on 2016/8/4 0004.
 */
public class IntBufferDemo {
    private static final int BSIZE = 1024;

    public static void main(String[] args) {
        ByteBuffer bb = ByteBuffer.allocate(BSIZE);
        IntBuffer ib = bb.asIntBuffer();
        ib.put(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9});
        System.out.println(ib.get(3));

        // index Ϊ 3 ������ֵ 33 ����ԭ����ֵ��ԭ����ֵ��ɾ����
        ib.put(3, 33);
        ib.flip();
        while (ib.hasRemaining()){
            System.out.print(ib.get() + " ");
        }
    }
}
