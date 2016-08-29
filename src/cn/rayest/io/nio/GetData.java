package cn.rayest.io.nio;

import java.nio.ByteBuffer;

/**
 * Created by Rayest on 2016/8/4 0004.
 */
public class GetData {
    private static final int BSIZE = 1024;

    public static void main(String[] args) {
        // �������Զ�����������������Ϊ 0���� 1024 ��
        ByteBuffer bb = ByteBuffer.allocate(BSIZE);
        // 1. ��⻺����������Ĵ�С
        int i = 0;
        // limit() ����Ҫ���ķ�Χ
        while (i++ < bb.limit()) {
            // �����⵽��ֵ��Ϊ�㣬����� nonzero
            if (bb.get() != 0) {
                System.out.println("nonzero");
            }
        }
        System.out.println(i);
        bb.rewind();

        //2. ���벢��ȡһ���ַ�����
        bb.asCharBuffer().put("CandyPay");
        // System.out.println(bb.getChar());
        char c;
        while ((c = bb.getChar()) != 0) {
            System.out.print(c + " ");
        }
        System.out.println();
        bb.rewind();

        // 3. ���벢��ȡһ�� short
        bb.asShortBuffer().put((short) 471124);
        System.out.println(bb.getShort());
        bb.rewind();

        // 4. ���벢��ȡһ�� long
        bb.asLongBuffer().put(963852741);
        System.out.println(bb.getLong());
        bb.rewind();

        // 5.���벢��ȡһ�� int
        bb.asIntBuffer().put(123456);
        System.out.println(bb.getInt());
        bb.rewind();

        // 6.���벢��ȡһ�� float
        bb.asFloatBuffer().put(123456789);
        System.out.println(bb.getFloat());
        bb.rewind();

        // 7.���벢��ȡһ�� double
        bb.asDoubleBuffer().put(123456789);
        System.out.println(bb.getDouble());
        bb.rewind();


    }
}