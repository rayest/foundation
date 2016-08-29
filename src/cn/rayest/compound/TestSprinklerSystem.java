package cn.rayest.compound;

/**
 * Created by Rayest on 2016/7/18 0018.
 */
class SprinklerSystem {
    private int value1;
    private WaterSource waterSource = new WaterSource();
    private double value2;
    private float value3;

    @Override
    public String toString() {
        return "SprinklerSystem{" +
                "value1=" + value1 +
                ", waterSource=" + waterSource +
                ", value2=" + value2 +
                ", value3=" + value3 +
                '}';
    }
}

class WaterSource {
    private String s;

    public WaterSource() {
        System.out.println("WaterSource()...");
        s = "Constructed...";
    }

    @Override
    public String toString() {
        return "WaterSource{" +
                "s='" + s + '\'' +
                '}';
    }
}

public class TestSprinklerSystem {
    public static void main(String[] args) {

        SprinklerSystem sprinklerSystem = new SprinklerSystem();
        System.out.println(sprinklerSystem);
     }
}