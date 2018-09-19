/*
 * Copyright (c) 2018. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.tommy.set;

import java.util.Iterator;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * Created by Tommy on 2018/9/17.
 */
public class TreeSetDemo1 {

    public static void main(String[] args) {

        TreeSet<Person> personTreeSet=new TreeSet<Person>();
        personTreeSet.add(new Person("aa",20));
        personTreeSet.add(new Person("bb",30));
        personTreeSet.add(new Person("cc",30));
        Iterator<Person> personIterator=personTreeSet.iterator();
        while(personIterator.hasNext()){
            Person p=personIterator.next();
            System.out.println(p.getName()+"----"+p.getAge());
        }

    }

}

class Person implements Comparable<Person>{


    private String name;
    private Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public int compareTo(Person o) {
        if(this.age-o.getAge()>0){
            return 1;
        }else if(this.age-o.getAge()<0){
            return -1;
        }
        return 0;
    }
}