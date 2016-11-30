package cn.rayest.effective.enums.planet;

/**
 * Created by Rayest on 2016/11/28 0028.
 */
public enum Planet {
    // 将数据/域和枚举常量关联
    MARS(4, 4),
    EARTH(2, 2),
    VENUS(3, 3),
    SATURN(6, 6),
    URANUS(7, 7),
    MERCURY(1, 1),
    JUPITER(5, 5),
    NEPTUNE(8, 8);

    // 声明实例域，必须为 final，并且最好设为 private
    private final double mass;
    private final double radius;
    private final double surfaceGravity;
    private static final double G = 9; // 常量

    // 构造函数，与枚举实例匹配
    Planet(int mass, int radius) {
        this.mass = mass;
        this.radius = radius;
        this.surfaceGravity = G * mass / (radius * radius);
    }

    // 为所有的实例域提供 get 方法
    public double mass() {
        return mass;
    }

    public double Radius() {
        return radius;
    }

    public double SurfaceGravity() {
        return surfaceGravity;
    }

    public double surfaceWeight(double mass) {
        return mass * surfaceGravity; // F = ma;
    }
}
