/*
 * Copyright (c) 2018. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

import java.util.Scanner;

/**
 * Created by Tommy on 2018/7/18.
 */
public class BinarySearch {

    public static void main(String[] args) {
             int[] array=new int[]{1,2,3,4,5,6,7,13,14,18,19};
             System.out.println("請輸入要查找的數");
             Scanner input=new Scanner(System.in);
             int number=input.nextInt();
             int index=-1;
             int start=0;
             int end=array.length-1;
             int middle;
             while(start<=end){
                 middle=(start+end)/2;
                 if(number==array[middle]){
                     index=middle+1;
                     break;
                 }
                 if(number<array[middle]){
                     end=middle-1;
                 }
                 if(number>array[middle]){
                     start=middle+1;
                 }

             }

             System.out.println(index);



    }
}
