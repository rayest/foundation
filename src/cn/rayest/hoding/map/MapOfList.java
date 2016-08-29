package cn.rayest.hoding.map;

import cn.rayest.typeinfo.pets.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static net.mindview.util.Print.print;

/**
 * Created by Rayest on 2016/8/2 0002.
 */
public class MapOfList {
    public static Map<Person, List<? extends Pet>> petPerson = new HashMap<>();
    static {
        petPerson.put(new Person("Pay"), Arrays.asList(new Dog("Dog"), new Cat("Cat"), new Hamster("Hamster")));
        petPerson.put(new Person("Ray"), Arrays.asList(new Dog("旺财"), new Cat("咪咪")));
    }

    public static void main(String[] args) {

        System.out.println(petPerson);

        // 打印 petPerson 图 map 中的键的 set 集合
        print("Person: " + petPerson.keySet());

        // 打印 petPerson 图 map 中的值的集合
        print("Pets: " + petPerson.values());

        for (Person person : petPerson.keySet()){
            print(person + " has:");
            for (Pet pet : petPerson.get(person)){
                print("    " + pet);
            }
        }

    }
}
