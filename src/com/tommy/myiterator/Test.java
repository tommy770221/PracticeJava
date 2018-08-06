/*
 * Copyright (c) 2018. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.tommy.myiterator;

/**
 * Created by Tommy on 2018/8/6.
 */
public class Test {

    public static void main(String[] args) {
        List<String> nameList=new ArrayList<String>();
        nameList.add("Mark");
        nameList.add("Marry");
        nameList.add("Lisa");

        Iterator<String> iterator=nameList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        for(int i=0;i<nameList.size();i++){
            System.out.println(nameList.get(i));
        }

    }

}
