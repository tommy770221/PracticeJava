/*
 * Copyright (c) 2018. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package frame;

import java.awt.*;

/**
 * Created by Tommy on 2018/9/26.
 */
public class FrameDemo1 {

    public static void main(String[] args) {
         MyframeDemo1 myframeDemo1=new MyframeDemo1("標題");
         myframeDemo1.init();
    }

}

class MyframeDemo1 extends Frame {

    public MyframeDemo1(String title){
        super(title);
    }

    public void init(){
        this.setSize(300,300);
        this.setBackground(Color.black);
        this.setVisible(true);
    }

}