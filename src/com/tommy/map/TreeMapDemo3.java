/*
 * Copyright (c) 2018. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.tommy.map;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by Tommy on 2018/8/7.
 */
public class TreeMapDemo3 {

    public static void main(String[] args) {
        TreeMap<Animal,String> animalStringTreeMap=new TreeMap<Animal, String>(new Comparator<Animal>() {
            @Override
            public int compare(Animal o1, Animal o2) {
               /* if(o1.getAge()-o2.getAge()>0){
                    return 1;
                }else if(o1.getAge()-o2.getAge()<0){
                    return -1;
                }*/
                if(o1.getName().compareTo(o2.getName())>0){
                    return 1;
                }else if(o1.getName().compareTo(o2.getName())<0){
                    return -1;
                }else if(o1.getAge()-o2.getAge()>0){
                    return 1;
                }

                return 0;
            }
        });
        animalStringTreeMap.put(new Animal("Tom",50),"dog3");
        animalStringTreeMap.put(new Animal("Marry",20),"cat");
        animalStringTreeMap.put(new Animal("Jerry",30),"cow");
        animalStringTreeMap.put(new Animal("Nono",40),"ant");
        animalStringTreeMap.put(new Animal("Tom",50),"dog2");

        System.out.println(animalStringTreeMap);
        System.out.println("依據名稱比較排序");
        for(Map.Entry<Animal,String> entry:animalStringTreeMap.entrySet()){
            System.out.println(entry.getKey().getAge() +"---"+entry.getKey().getName()+"----"+entry.getValue());
        }

    }

}

class Animal{
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}