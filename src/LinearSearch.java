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
public class LinearSearch {

    public static void main(String[] args) {
            int[] array=new int[]{10,100,80,50,70,60,90};
            System.out.println("請輸入查找的數字");
            Scanner input=new Scanner(System.in);
            int number=input.nextInt();
            int index=-1;
            for(int i=0;i<array.length;i++){
                if(array[i]==number){
                    index=i+1;
                    break;
                }
            }

            if(index!=-1) {
                 System.out.println("找到在陣列中的第"+index+"個位置");
            }else{
                System.out.println("要找的數字不存在");
            }

    }
}
