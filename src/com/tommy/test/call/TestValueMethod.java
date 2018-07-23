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
public class TestValueMethod {



        public void testMethod(TestCallByValue testCallByValue){
            testCallByValue.call="5678";
            System.out.println(testCallByValue.call);
    }
}
