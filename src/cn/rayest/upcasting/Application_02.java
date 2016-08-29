package cn.rayest.upcasting;

import java.util.Random;

/**
 * Created by Rayest on 2016/7/24 0024.
 */
public class Application_02 {
    private static RandomShapeGenerator gen = new RandomShapeGenerator();

    public static void main(String[] args) {

        Shape[] shapes = new Shape[9];
        for (int i = 0; i < shapes.length; i++) {

            // �������ڽ��� next() �������ص� Shape ���Ͷ���
            shapes[i] = gen.next();

        }
        for (Shape shape : shapes) {
            /*
                ����Ԫ�ص��� draw() ����ʱ���Żᷢ����������ص���Ϊ
                ���������úͷ����������
            */
            shape.draw();
        }
    }
}

class Shape {
    public void draw() {
    }

    public void erase() {
    }
}
class Circle extends Shape {
    public void draw() {
        System.out.println("Circle.draw()...");
    }
    public void erase() {
        System.out.println("Circle.erase()...");
    }
}
class Triangle extends Shape {
    public void draw() {
        System.out.println("Triangle.draw()...");
    }
    public void erase() {
        System.out.println("Triangle.erase()...");
    }
}

class Square extends Shape {
    public void draw() {
        System.out.println("Square.draw()...");
    }
    public void erase() {
        System.out.println("Square.erase()...");
    }
}
class RandomShapeGenerator {
    private Random random = new Random(47);
    public Shape next() {
        switch (random.nextInt(3)) {
            default:
            case 0:
                return new Circle();   // upcasting
            case 1:
                return new Square();   // upcasting
            case 2:
                return new Triangle(); // upcasting
            /*
               1. ÿ�� return ��佫ȡ��һ��ָ��ĳ�� Circle��Square �� Triangle ������
               2. return ��佫ȡ�õ������� Shape ���ʹ� next() �����з��ͳ�ȥ
               3. ȡ�õ���ͨ�õ� Shape �������ã����޷�֪�������������ʲô
            */
        }
    }
}
