package cn.rayest.hoding.map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static net.mindview.util.Print.print;

/**
 * Created by Rayest on 2016/8/2 0002.
 */
public class AppUser {
    public static void main(String[] args) {

        // simple Map
        Map<Integer, String> userMap = new HashMap<>();
        userMap.put(1, "Pay");
        userMap.put(2, "Ray");
        userMap.put(3, "Candy");

        print(userMap);

        print("key: " + userMap.keySet());
        print("value: " + userMap.values());

        // map of list
        Map<String, List<String>> loverMap = new HashMap<>();
        loverMap.put("Pay", Arrays.asList("Lanzhou"));
        loverMap.put("Candy", Arrays.asList("Lanzhou", "Fuzhou"));
        print(loverMap);
        print("key: " + loverMap.keySet());
        print("value: " + loverMap.values());

    }
}
