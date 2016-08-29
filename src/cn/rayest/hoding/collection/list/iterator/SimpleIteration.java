package cn.rayest.hoding.collection.list.iterator;

import cn.rayest.typeinfo.pets.Pet;
import cn.rayest.typeinfo.pets.Pets;

import java.util.Iterator;
import java.util.List;

/**
 * Created by Rayest on 2016/8/2 0002.
 */
public class SimpleIteration {
    public static void main(String[] args) {

        // 创建一个包含 12 个对象元素的数组列表
        List<Pet> pets = Pets.arrayList(12);
        System.out.println(pets);

        // 数组返回一个 iterator 对象，并准备返回第一个元素
        Iterator<Pet> iterator = pets.iterator();
        while (iterator.hasNext()){
            Pet pet = iterator.next();
            System.out.print(pet.id() + ":" + pet + " ");
        }

        System.out.println();

        // for 循环与 iterator 的对比
        for (Pet pet : pets){
            System.out.print(pet.id() + ":" + pet + " ");
        }

        System.out.println();

        // iterator 进行元素删除
        iterator = pets.iterator();
        for (int i = 0; i < 6; i++) {
            iterator.next();
            iterator.remove();
        }
        System.out.println(pets);
    }
}
