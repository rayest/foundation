package cn.rayest.hoding.collection.list.linkedList;

import cn.rayest.typeinfo.pets.Hamster;
import cn.rayest.typeinfo.pets.Pet;
import cn.rayest.typeinfo.pets.Pets;
import cn.rayest.typeinfo.pets.Rat;

import java.util.LinkedList;

/**
 * Created by Rayest on 2016/8/2 0002.
 */
public class linkedListFeatures {
    public static void main(String[] args) {
        LinkedList<Pet> pets = new LinkedList<>(Pets.arrayList(5));
        System.out.println(pets);

        System.out.println("pets.getFirst():" + pets.getFirst());
        System.out.println("pets.element():" + pets.element());
        System.out.println("pets.peek():" + pets.peek());

        System.out.println("pets.remove():" + pets.remove());
        System.out.println(pets.poll());

        pets.addFirst(new Rat());
        System.out.println(pets);

        pets.offer(Pets.randomPet());
        System.out.println(pets);

        pets.addLast(new Hamster());
        System.out.println(pets);

        System.out.println(pets.removeLast());

    }
}
