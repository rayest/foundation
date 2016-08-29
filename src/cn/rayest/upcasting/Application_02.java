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

            // 数组用于接收 next() 方法返回的 Shape 类型对象
            shapes[i] = gen.next();

        }
        for (Shape shape : shapes) {
            /*
                数组元素调用 draw() 方法时，才会发生与类型相关的行为
                ？方法调用和方法主体关联
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
               1. 每个 return 语句将取得一个指向某个 Circle、Square 或 Triangle 的引用
               2. return 语句将取得的引用以 Shape 类型从 next() 方法中发送出去
               3. 取得的是通用的 Shape 类型引用，而无法知道其具体类型是什么
            */
        }
    }
}
