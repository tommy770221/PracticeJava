/*
 * Copyright (c) 2018. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.tommy.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by Tommy on 2018/8/6.
 */
public class HashMapDemo1 {

    public static void main(String[] args) {
        HashMap<String,String> hashMap=new HashMap<String, String>();
        hashMap.put("1","Tom");
        hashMap.put("1","Jason");
        hashMap.put("2","Tom");
        hashMap.put("3","Kelly");
        System.out.println(hashMap);

        for(String key:hashMap.keySet()){
            System.out.println("key = " + key);
        }

        for(String value:hashMap.values()){
            System.out.println("value = " + value);
        }

        /*
        * 當我們調用 put key value方法的時候首先會把key和value 封裝到entry這個
        * 靜態內部類對象中,把entry對象在添加到array中,所以我們想獲得map
        * 中所有的鍵植對,我們指要獲取數組中的所有entry對象
        * 接下來調用entry對象的getKey和getValue方法就能獲取鍵值對
        * */
        Set<Map.Entry<String,String>> entries=hashMap.entrySet();
        for(Map.Entry<String,String> entry:entries){
            System.out.println(entry.getKey()+"----"+entry.getValue());
        }

        /*
        * HashMap調用默認方法會產生一個為長度默認為16的Entry數組
        * int Hash=hash(key.hashCode());
        * 首先調用key的hashcode方法來得到一個整數--哈西碼
        * 把哈西碼作為參數傳到hash函數中來進行運算--散列運算
        * int i= indexFor(hash ,table.length)
        * 把散列值 和數組的長度作運算 最終得到存放到數組的位置(下標)
        * hashmap內部的結構是數組鍊表結構
        * 因為不同的key有可能算出相同的hash值,根據hash值計算出存放
        * 到數組的下標會衝突
        *
        *
        * */

    }
}
