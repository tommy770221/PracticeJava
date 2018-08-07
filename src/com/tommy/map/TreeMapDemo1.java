/*
 * Copyright (c) 2018. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.tommy.map;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * Created by Tommy on 2018/8/7.
 */
public class TreeMapDemo1 {
    public static void main(String[] args) {
        TreeMap<String,String> treeMap=new TreeMap<String, String>();
        treeMap.put("5","Tom");
        treeMap.put("4","Jason");
        treeMap.put("2","Tom");
        treeMap.put("3","Kelly");
        treeMap.put("2","Tommy");
        System.out.println(treeMap);
        Set<Map.Entry<String,String>> entrySet=treeMap.entrySet();
        for(Map.Entry<String,String> entry:entrySet){
            System.out.println(entry.getKey()+"----"+entry.getValue());
        }

    }
}
