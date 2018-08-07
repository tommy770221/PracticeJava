/*
 * Copyright (c) 2018. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.tommy.map;

import java.util.TreeMap;

/**
 * Created by Tommy on 2018/8/7.
 */
public class TreeMapDemo2 {
    public static void main(String[] args) {
        TreeMap<Person,String> personStringTreeMap=new TreeMap<Person, String>();
        personStringTreeMap.put(new Person("Tom",10),"dog1");
        personStringTreeMap.put(new Person("Marry",20),"cat");
        personStringTreeMap.put(new Person("Jerry",30),"cow");
        personStringTreeMap.put(new Person("Nono",40),"ant");
        personStringTreeMap.put(new Person("Tom",10),"dog");
        System.out.println(personStringTreeMap);
    }
}

class Person implements Comparable<Person>{

    private String name;

    private  int age;

    public Person(String name, int age) {
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


    @Override
    public int compareTo(Person o) {
        if(this.age-o.age>0){
            return 1;
        }else if(this.age-o.age<0){
            return -1;
        }
        return 0;
    }
}