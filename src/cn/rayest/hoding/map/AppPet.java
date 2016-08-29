package cn.rayest.hoding.map;

import cn.rayest.typeinfo.pets.Cat;
import cn.rayest.typeinfo.pets.Dog;
import cn.rayest.typeinfo.pets.Hamster;
import cn.rayest.typeinfo.pets.Pet;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Rayest on 2016/8/2 0002.
 */
public class AppPet {
    public static void main(String[] args) {
        Map<String, Pet> petMap = new HashMap<>();

        petMap.put("My Dog", new Dog("dog"));
        petMap.put("My Cat", new Cat("cat"));
        petMap.put("My Hamster", new Hamster("Bosco"));

        System.out.println(petMap);

        Pet dog = petMap.get("My Dog");

        System.out.println(dog);
        System.out.println(petMap.containsKey("My Dog"));
        System.out.println(petMap.containsValue("dog"));
    }
}
