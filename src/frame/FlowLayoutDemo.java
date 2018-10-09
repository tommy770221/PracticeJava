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
public class FlowLayoutDemo {
    public static void main(String[] args) {
        MyFrame3 myFrame3=new MyFrame3("this is title !");
        myFrame3.init();
    }
}

class MyFrame3 extends Frame{

    public MyFrame3(String title){
        super(title);
    }

    public void init(){
        FlowLayout flowLayout=new FlowLayout(FlowLayout.LEFT,50,50);
        this.setLayout(flowLayout);
        this.setBackground(Color.white);
        this.setSize(500,500);
        this.setVisible(true);
        this.add(new Button("btn1"));
        this.add(new Button("btn2"));
        this.add(new Button("btn3"));
        this.add(new Button("btn4"));
        this.add(new Button("btn5"));
        this.add(new Button("btn6"));
        this.add(new Button("btn7"));
    }

}