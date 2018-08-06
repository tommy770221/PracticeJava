/*
 * Copyright (c) 2018. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.tommy.list;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by Tommy on 2018/8/5.
 */
public class LinketListDemo {

    public static void main(String[] args) {
          LinkedList<String> linkedList=new LinkedList<String>();
          linkedList.add("Tom");
          linkedList.add("Joe");
          linkedList.add("Marry");
          linkedList.add("Gary");
          linkedList.add("Jack");
          linkedList.add("Lily");
          linkedList.addFirst("Rocky");
          linkedList.addLast("Mark");

           Iterator<String> iterator=linkedList.iterator();
           while(iterator.hasNext()){
               String name=iterator.next();
               System.out.println(" name : "+name);
           }

        for(Iterator<String> it=linkedList.iterator();it.hasNext();){
            String name=it.next();
            System.out.println(" name : "+name);
        }

        System.out.println(linkedList.removeFirst());
        System.out.println(linkedList.size());
        linkedList.clear();
        System.out.println(linkedList.pollFirst());
        System.out.println(linkedList.size());

    }
}
