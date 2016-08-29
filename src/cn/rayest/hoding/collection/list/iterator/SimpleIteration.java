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

        // ����һ������ 12 ������Ԫ�ص������б�
        List<Pet> pets = Pets.arrayList(12);
        System.out.println(pets);

        // ���鷵��һ�� iterator ���󣬲�׼�����ص�һ��Ԫ��
        Iterator<Pet> iterator = pets.iterator();
        while (iterator.hasNext()){
            Pet pet = iterator.next();
            System.out.print(pet.id() + ":" + pet + " ");
        }

        System.out.println();

        // for ѭ���� iterator �ĶԱ�
        for (Pet pet : pets){
            System.out.print(pet.id() + ":" + pet + " ");
        }

        System.out.println();

        // iterator ����Ԫ��ɾ��
        iterator = pets.iterator();
        for (int i = 0; i < 6; i++) {
            iterator.next();
            iterator.remove();
        }
        System.out.println(pets);
    }
}
