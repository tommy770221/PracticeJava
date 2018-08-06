/*
 * Copyright (c) 2018. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.tommy.list;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Tommy on 2018/8/5.
 */
public class ArrayListDemo {

    public static void main(String args[]){


        /*  當我們調動無參數構造方法來構造一個無參數構造對象的時候
            他會在內部分配一個出使大小為10的 object[]
            當添加容量的大小超過數組大小的時候,會產生一個新的數據,
            新的數組大小為原來數組大小的1.5倍 接著把原數組中的數據
            拷貝到新的數組中
        */
        ArrayList<String> arrayList=new ArrayList<String>();

        arrayList.add("String 1");
        arrayList.add("String 2");
        arrayList.add(1,"Jack");
        arrayList.add(2,"Marry");

        for(String abc:arrayList){
            System.out.println(abc);
        }

        Iterator<String> iterator=arrayList.iterator();

        while (iterator.hasNext()){
            String name=iterator.next();
            System.out.println("iterator name: "+name);
        }
        System.out.println(arrayList.indexOf("Jack"));
        System.out.println(arrayList.remove("Jack"));
        System.out.println(arrayList.size());
        System.out.println(arrayList.contains("Marry"));

    }


}
