/*
 * Copyright (c) 2018. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.tommy.list;

import java.util.ArrayList;

/**
 * Created by Tommy on 2018/8/5.
 */
public class ArrayListDemo2 {

    public static void main(String[] args) {

        ArrayList<Student> studentsList=new ArrayList<Student>();
        Student std1=new Student("Marry",50);
        Student std2=new Student("Lisa",20);
        Student std3=new Student("Jack",30);
        Student std4=new Student("Tommy",25);
        Student std5=new Student("Marry",10);
        studentsList.add(std1);
        studentsList.add(std2);
        studentsList.add(std3);
        studentsList.add(std4);
        studentsList.add(std5);
        Student std6=new Student("Marry",10);
        System.out.println( studentsList.contains(std6));
        System.out.println( studentsList.indexOf(std6));
        System.out.println( studentsList.remove(std6));
        System.out.println( studentsList.indexOf(std5));
        System.out.println( studentsList.size());




    }


}


class Student{

    private String name;
    private int value;

    public Student(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (value != student.value) return false;
        return name != null ? name.equals(student.name) : student.name == null;
    }


}