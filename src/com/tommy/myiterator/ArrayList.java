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
public class ArrayList<T> implements List<T>{

    private Object[] object=null;
    private int index;
    private int size;

    public ArrayList(){
        object=new Object[10];
        index=0;
        size=0;
    }

    @Override
    public void add(T t) {
         this.object[index++]=t;
         size++;
    }

    @Override
    public T get(int index) {
        return (T)this.object[index];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Iterator<T> iterator() {
        return new MyIterator<T>(this);
    }
}
