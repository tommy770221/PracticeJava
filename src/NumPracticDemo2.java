/*
 * Copyright (c) 2018. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

/**
 * Created by Tommy on 2018/7/3.
 */
public class NumPracticDemo2 {

    public static void main(String[] args) {

        int num1=10;
        int num2=8;
        int num3=5;
        boolean res=false;

        //  && 只要前面錯就不值行
        //  || 只要後面錯就不執行

        System.out.println((num1<num2) & (res=num2>num3)); //邏輯&  不管前面的表達示是真是假 後面都會運行 false
        System.out.println(res); //true
        System.out.println((num1>num2) | (res=num2>num3)); //邏輯|  不管前面的表達示是真是假 後面都會運行 true
        System.out.println(res); //true
        System.out.println((num1>num2) ^ (num2>num3)); //兩個邏輯中 1真1假 才會返回真  false

    }

}
