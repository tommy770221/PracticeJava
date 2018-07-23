/*
 * Copyright (c) 2018. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.tommy.test.call;

/**
 * Created by Tommy on 2018/7/22.
 */
public class CallByValue {

    public static void main(String[] args) {
           TestCallByValue testCallByValue=new TestCallByValue();
           TestValueMethod testValueMethod=new TestValueMethod();

           testCallByValue.call="1234";

           testValueMethod.testMethod(testCallByValue);
            System.out.println(testCallByValue.call);

           TestCallByValue testCallByValue1=new TestCallByValue();
           testCallByValue1.call="123456";
           testValueMethod.testMethod(testCallByValue1);
            System.out.println(testCallByValue1.call);

    }
}
