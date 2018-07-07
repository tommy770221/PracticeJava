/*
 * Copyright (c) 2018. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

/**
 * Created by Tommy on 2018/6/8.
 */
public class OpratorDemo1 {

    public static void main(String[] args) {

        int num1=10;
        int num2=8;
        int res=num1+num2;

        System.out.println(" ftest = "+res); // ftest = 18
        System.out.println();
        String str="操作結果";
        System.out.println(str+res); //操作結果18
        System.out.println(str+res+10); //操作結果1810
        System.out.println(str+(res+10.5)); //操作結果28.5
        System.out.println(str+res+"男"); //操作結果18男
        System.out.println(str+res+true); //操作結果18true
        System.out.println(str+10+res); //操作結果1018
        //System.out.println(str+num1-num2); compile報錯
        int data=num1++;
        System.out.println("numl: "+num1);
        System.out.println("data: "+data);

        int x=10;
        int data2=++x;
        System.out.println(" x: "+x);
        System.out.println(" data2 : "+data2);

        short s=5;
        // s=s+3;
        // System.out.println(s);  //需要整數行別
        s+=3;
        System.out.println("s="+s);





    }

}
