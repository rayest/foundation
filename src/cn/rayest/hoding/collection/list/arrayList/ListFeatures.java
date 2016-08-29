package cn.rayest.hoding.collection.list.arrayList;

import cn.rayest.typeinfo.pets.*;

import java.util.*;

/**
 * Created by Rayest on 2016/8/1 0001.
 */
public class ListFeatures {
    public static void main(String[] args) {
        Random random = new Random(47);
        List<Pet> pets = Pets.arrayList(7);

        System.out.println("1: " + pets);

        Hamster hamster = new Hamster();
        pets.add(hamster);

        System.out.println("2: " + pets);

        System.out.println("3: " + pets.contains(hamster));

        pets.remove(hamster);

        Pet pet = pets.get(2);
        System.out.println("4: " + pet + " " + pets.indexOf(pet));

        Cymric cymric = new Cymric();
        System.out.println("5: " + pets.indexOf(cymric));
        System.out.println("6: " + pets.remove(cymric));

        System.out.println("7: " + pets.remove(pet));
        System.out.println("8: " + pets);

        pets.add(3, new Mouse());
        System.out.println("9: " + pets);

        List<Pet> sub = pets.subList(1, 4);
        System.out.println("   subList: " + sub);

        System.out.println("10: " + pets.containsAll(sub));

        Collections.sort(sub);
        System.out.println("sorted subList: " + sub);
        System.out.println("11: " + pets.containsAll(sub));

        Collections.shuffle(sub, random);
        System.out.println("shuffled subList: " + sub);
        System.out.println("12: " + pets.containsAll(sub));

        List<Pet> copy = new ArrayList<>(pets);
        sub = Arrays.asList(pets.get(1), pets.get(4));
        System.out.println("sub: " + sub);








    }
}
