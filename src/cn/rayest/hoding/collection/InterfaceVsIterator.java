package cn.rayest.hoding.collection;

import cn.rayest.typeinfo.pets.Pet;
import cn.rayest.typeinfo.pets.Pets;

import java.util.*;

import static net.mindview.util.Print.print;

/**
 * Created by Rayest on 2016/8/2 0002.
 */
public class InterfaceVsIterator {

    // iterator ±éÀú
    public static void display(Iterator<Pet> iterator){
        while (iterator.hasNext()){
            Pet pet = iterator.next();
            System.out.print(pet.id() + ":" + pet + " ");
        }
        System.out.println();
    }

    // foreach ±éÀú
    public static void display(Collection<Pet> pets){
        for (Pet pet : pets){
            System.out.print(pet.id() + ":" + pet + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<Pet> petList = Pets.arrayList(8);
        Set<Pet> petSet = new HashSet<>(petList);
        Map<String, Pet> petMap = new LinkedHashMap<>();

        String[] names = "pet_1, pet_2, pet_3, pet_4, pet_5, pet_6, pet_7, pet_8".split(",");
        for (int i = 0; i < names.length; i++) {
            petMap.put(names[i], petList.get(i));
        }

        display(petList);
        display(petSet);

        display(petList.iterator());
        display(petSet.iterator());

        print(petMap);
        print(petMap.keySet());
        print(petMap.values());
        display(petMap.values());
        display(petMap.values().iterator());


    }
}
