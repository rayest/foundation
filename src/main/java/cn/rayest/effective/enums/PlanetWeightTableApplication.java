package cn.rayest.effective.enums;

/**
 * Created by Rayest on 2016/11/28 0028.
 */
public class PlanetWeightTableApplication {
    public static void main(String[] args) {
        double earthWeight = Double.parseDouble(args[0]);
        double mass = earthWeight / Planet.EARTH.SurfaceGravity();
        for (Planet planet : Planet.values()) {
            System.out.println(planet.surfaceWeight(mass) + "\n");
        }
    }
}
