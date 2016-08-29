package cn.rayest.hoding.collection.list.iterator;

import cn.rayest.typeinfo.pets.Pet;
import cn.rayest.typeinfo.pets.Pets;

import java.util.*;

/**
 * Created by Rayest on 2016/8/2 0002.
 */
public class CrossContainerIteration {

    public static void display(Iterator<Pet> iterator){
        while (iterator.hasNext()){
            Pet pet = iterator.next();
            System.out.print(pet.id() + ":" + pet + " ");
        }

        System.out.println();

    }

    public static void main(String[] args) {

        List<Pet> pets = Pets.arrayList(8);
        display(pets.iterator());

        List<Pet> pet_LinkList = new LinkedList<>(pets);
        display(pet_LinkList.iterator());

        Set<Pet> pet_HashSet = new HashSet<>(pets);
        display(pet_HashSet.iterator());

        Set<Pet> pet_TreeSet = new TreeSet<>(pets);
        display(pet_TreeSet.iterator());

    }
}