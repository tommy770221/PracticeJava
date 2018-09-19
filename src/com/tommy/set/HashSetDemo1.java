/*
 * Copyright (c) 2018. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.tommy.set;

import java.util.HashSet;

/**
 * Created by Tommy on 2018/9/17.
 */
public class HashSetDemo1 {

    public static void main(String[] args) {
        HashSet<String> data=new HashSet<String>();
        System.out.println(data.add("aa"));
        data.add("bb");
        data.add("cc");
        System.out.println(data.add("aa"));
        data.add("dd");
        System.out.println(data);
        HashSet<Student> studentHashSet=new HashSet<Student>();
        studentHashSet.add(new Student("aa",20));
        studentHashSet.add(new Student("bb",30));
        studentHashSet.add(new Student("aa",20));
        System.out.println(studentHashSet.size());


    }

}

class Student{

    private String name;
    private Integer age;

    public Student(String name, Integer age) {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (name != null ? !name.equals(student.name) : student.name != null) return false;
        return age != null ? age.equals(student.age) : student.age == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (age != null ? age.hashCode() : 0);
        return result;
    }
}