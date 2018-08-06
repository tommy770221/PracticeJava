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
public class LinkListDemo2 {

    public static void main(String[] args) {
        MyStack<String> myStack=new MyStack<String>();
        myStack.push("Mary");
        myStack.push("Cat");
        myStack.push("Dog");
        myStack.push("Kate");
        String pop1=myStack.pop();
        String pop2=myStack.pop();

        System.out.println("pop1 " +pop1);
        System.out.println("pop2 " +pop2);

        Iterator<String> it= myStack.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        MyQue<Integer> myQue=new MyQue<Integer>();
        myQue.push(1);
        myQue.push(2);
        myQue.push(3);
        myQue.push(4);
        myQue.push(5);
        Integer popQue1=myQue.pop();
        Integer popQue2=myQue.pop();

        System.out.println("pop1 " +popQue1);
        System.out.println("pop2 " +popQue2);

        Iterator<Integer> itMy=myQue.iterator();
         while(itMy.hasNext()){
            System.out.println(itMy.next());
         }

    }

}

class MyStack<T>{

    private LinkedList<T> data=null;

    public MyStack(){
        data=new LinkedList<T>();
    }

    public void push(T t){
        data.addFirst(t);
    }

    public T pop(){
        return data.pop();
    }

    public Iterator<T> iterator(){
        return data.iterator();
    }


}

class MyQue<T>{
    private LinkedList<T> data=new LinkedList<T>();

    public MyQue(){
        data=new LinkedList<T>();
    }

    public void push(T t){
        data.addFirst(t);
    }

    public T pop(){
        return data.removeLast();
    }

    public Iterator<T> iterator(){
        return data.iterator();
    }
}