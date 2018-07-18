/*
 * Copyright (c) 2018. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

/**
 * Created by Tommy on 2018/7/18.
 */
public class Maxmin {

    public static void main(String[] args) {
           int[] array = new int[]{10,100,80,50,70,60,90};
           int maxNumber=array[0];
           int minNumber=array[0];
           for(int x=1;x<array.length;x++){
               if(array[x]>maxNumber){
                   maxNumber=array[x];
               }
               if(array[x]<minNumber) {
                  minNumber=array[x];
               }

           }
           System.out.println("Max :" +maxNumber);
           System.out.println("Min :"+minNumber);
    }
}
