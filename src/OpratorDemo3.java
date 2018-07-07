/*
 * Copyright (c) 2018. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

/**
 * Created by Tommy on 2018/7/7.
 */
public class OpratorDemo3 {

    public static void main(String[] args) {

        //計算機內部都是以二進制存在的
        /*
            而二進制在計算機內部編碼又有多種編碼存在

            計算機內部對二進制進行運算用的是補碼
            比如 1-1=1+(-1)=0

            原碼3: 0000 0011 第一位是符號位, 0代表正  1代表負
            反碼:  正數的反碼和原碼一樣 負數  1000 0011 (-3原碼) => 1111 1100(反碼)  保留符號位其餘按位去反  ^符號運算
            補碼:  正數的反碼和原碼和補碼都一樣,負數的補碼=反碼+1
                                             1000 0011 (-3原碼) => 1111 1100(反碼) => 1111 1101(補碼)

            負數的原碼和補碼間的轉換
            負數的原碼=負數的補碼-1取反
            負數的原碼=負數的補碼取反+1

            1. 10001(原碼)--->11110+1=11111;
            2. 11111-1=11110-->=10001
            3. 能不能先把補碼取反再+1呢
               11111-->10000+1-->10001

         */

         int x=128;
         int y=129;

         System.out.println(" num1與num2的結果是:"+(x&y));
         /*
          0000 0000 0000 0000 0000 0000 0000 1000 0000 (補)
          0000 0000 0000 0000 0000 0000 0000 1000 0001 (補)
          --------------------------------------------------
          0000 0000 0000 0000 0000 0000 0000 1000 0001
          */

         System.out.println("4 左移 3 = "+(4>>3) );
         System.out.println("-2 左移 3 = "+(-2>>3) );

        System.out.println("4 右移 3 = "+(4<<3) );
        System.out.println("-2 右移 3 = "+(-2<<3) );

    }

}
