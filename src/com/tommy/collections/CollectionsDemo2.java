/*
 * Copyright (c) 2018. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.tommy.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Tommy on 2018/9/23.
 */
public class CollectionsDemo2 {

    public static void main(String[] args) {
        List<Person> personList=new ArrayList<Person>();
        personList.add(new Person("Jack",30,20));
        personList.add(new Person("rose",10,7));
        personList.add(new Person("marry",30,6));
        personList.add(new Person("Wang",50,20));
        personList.add(new Person("Jay",20,11));

        Collections.sort(personList, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if(o1.getAge()-o2.getAge()>0){
                    return 1;
                }else if(o1.getAge()-o2.getAge()<0){
                    return -1;
                }else{
                    return o1.getName().compareTo(o2.getName());
                }
            }
        });

         for(Person p:personList){
             System.out.println(p);
         }

    }

}

class Person{

    private String name;
    private int age;
    private int id;

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Person(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public String toString(){
        return "Person [name="+name+", age="+age+" , id="+id+"]";
    }
}