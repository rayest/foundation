package cn.rayest.io.nio;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;

/**
 * Created by Rayest on 2016/8/4 0004.
 */
public class ViewBuffers {
    public static void main(String[] args) {
        ByteBuffer bb = ByteBuffer.wrap(new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 'a'});
        bb.rewind();
        while (bb.hasRemaining()){
            System.out.print(bb.position() + ": " + bb.get());
        }

        System.out.println();

        // char  ”Õºª∫≥Â∆˜
        CharBuffer cb = ((ByteBuffer)bb.rewind()).asCharBuffer();
        while (cb.hasRemaining()){
            System.out.print(cb.position() + ": " + cb.get());
        }
    }
}
