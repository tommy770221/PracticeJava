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
public class MyIterator<T> implements Iterator<T> {

    private List<T> list=null;
    private int index=0;


    public MyIterator(List<T> list){
           this.list=list;
    }

    @Override
    public boolean hasNext() {
        return index<list.size();
    }

    @Override
    public T next() {
        return list.get(index++);
    }
}
