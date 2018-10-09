/*
 * Copyright (c) 2018. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.tommy.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created by Tommy on 2018/9/17.
 */
public class CollectionDemo1 {

    public static void main(String[] args) {

        List<String> nList=new ArrayList<String>();
        nList.add("aa");
        nList.add("bb");
        nList.add("cc");
        nList.add("dd");
        nList.add("bb");
        nList.add("cc");
        for(String n:nList){
            System.out.println(n +" ");
        }

        System.out.println();
        System.out.println("交換順序後");
        Collections.swap(nList,1,2);
        for(String s:nList){
            System.out.println(s +" ");
        }

        System.out.println("排序後");
        Collections.sort(nList);
        for(String s:nList){
            System.out.println(s +" ");
        }
        System.out.println("二分查找法");
        System.out.println(Collections.binarySearch(nList,"cc"));
        System.out.println("打亂順序");
        Collections.shuffle(nList);
        for(String s:nList){
            System.out.println(s +" ");
        }
        System.out.println("填充");
        Collections.fill(nList,"ccccc");
        for(String s:nList){
            System.out.println(s +" ");
        }


    }

}
