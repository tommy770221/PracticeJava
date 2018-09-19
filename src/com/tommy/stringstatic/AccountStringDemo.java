/*
 * Copyright (c) 2018. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.tommy.stringstatic;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by Tommy on 2018/9/17.
 */
public class AccountStringDemo {

    public static void main(String[] args) {
           String[] strs={"aa","bb","cc","dd","aa","bb","bb"};
           CountStringUtils.printdata(CountStringUtils.acoount(strs));

    }

}

class CountStringUtils{

    public static Map<String,Integer> acoount(String[] strs){
            Map<String,Integer> integerMap=new HashMap<String, Integer>();
            for(int i=0;i<strs.length;i++){
                 String str=strs[i];
                 if(integerMap.get(str)==null){
                     integerMap.put(str,1);
                 }else{
                     integerMap.put(str,integerMap.get(str)+1);
                 }
            }
            return integerMap;

    }

    public static void printdata(Map<String,Integer> data){
        Set<Map.Entry<String,Integer>> entries= data.entrySet();
        for(Map.Entry<String,Integer> entry:entries){
            System.out.println("key = : "+entry.getKey());
            System.out.println("value = : "+entry.getValue());
            System.out.println(entry.getKey() + " 總共出現了幾次 : "+entry.getValue());
        }
    }

}