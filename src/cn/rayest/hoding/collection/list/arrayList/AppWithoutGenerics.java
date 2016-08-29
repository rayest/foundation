package cn.rayest.hoding.collection.list.arrayList;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rayest on 2016/8/1 0001.
 */
public class AppWithoutGenerics {
    public static void main(String[] args) {
        List appleList = new ArrayList();

        appleList.add(new Apple("green", 1));
        appleList.add(new Apple("red", 2));
        appleList.add(new Apple("yellow", 3));

        appleList.add(new Orange("green", 1));
        appleList.add(new Orange("red", 2));
        appleList.add(new Orange("yellow", 3));

        for (int i = 0; i < appleList.size(); i++) {
            System.out.println(appleList.get(i).toString());
        }

    }
}

class Apple{
    private String color;
    private int size;

    public Apple() {
    }

    public Apple(String color, int size) {
        this.color = color;
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "color='" + color + '\'' +
                ", size=" + size +
                '}';
    }
}

class LanzhouApple extends Apple{
    private String location;

    public LanzhouApple(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "LanzhouApple{" +
                "location='" + location + '\'' +
                '}';
    }
}

class NanjingApple extends Apple{
     private String location;

    public NanjingApple(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "NanjingApple{" +
                "location='" + location + '\'' +
                '}';
    }
}

class Orange{
    private String color;
    private int size;

    public Orange() {
    }

    public Orange(String color, int size) {
        this.color = color;
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Orange{" +
                "color='" + color + '\'' +
                ", size=" + size +
                '}';
    }
}

class LanzhouOrange extends Orange{
    private String location;

    public LanzhouOrange(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "LanzhouOrange{" +
                "location='" + location + '\'' +
                '}';
    }
}
