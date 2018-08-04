package com.caculate.leednode;

import java.util.Random;

public class MathRandomDemo {

    public static void main(String[] args) {

        System.out.println(Math.floor(10.9));
        System.out.println(Math.abs(-10.9));
        System.out.println(Math.ceil(-10.55));
        System.out.println(Math.pow(2,3));
        System.out.println(Math.round(10.6));
        System.out.println(Math.random());

        Random random=new Random(10);
        System.out.println(random.nextInt());

    }
}
