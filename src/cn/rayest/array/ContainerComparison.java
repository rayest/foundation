package cn.rayest.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static net.mindview.util.Print.print;

/**
 * Created by Rayest on 2016/8/2 0002.
 */
public class ContainerComparison {
    public static void main(String[] args) {
        // Êý×é array []
        BerylliumSphere[] spheres = new BerylliumSphere[10];
        for (int i = 0; i < 5; i++) {
            spheres[i] = new BerylliumSphere();
        }
        print(Arrays.toString(spheres));
        print(spheres[4]);

        // ±í£ºarrayList
        List<BerylliumSphere> sphereList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            sphereList.add(new BerylliumSphere());
        }
        print(sphereList);
        print(sphereList.get(4));


    }
}
    class BerylliumSphere {
        private static long counter;
        private final long id = counter++;

        @Override
        public String toString() {
            return "Sphere " + id;
        }
    }
