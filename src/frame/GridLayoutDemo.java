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
 * Created by Tommy on 2018/10/5.
 */
public class GridLayoutDemo {

    public static void main(String[] args) {
          MyFrame5 myFrame5=new MyFrame5("GridLayoutDemo");
          myFrame5.init();
    }
}

class MyFrame5 extends Frame{

    public MyFrame5(String title){
        super(title);
    }

    public void init(){
        GridLayout gridLayout=new GridLayout(3,2);
        this.setLayout(gridLayout);
        this.setSize(600,300);
        this.setVisible(true);
        this.setBackground(Color.black);
        this.add(new Button("btn1"));
        this.add(new Button("btn2"));
        this.add(new Button("btn3"));
        this.add(new Button("btn4"));
        this.add(new Button("btn5"));
        this.add(new Button("btn6"));
        this.add(new Button("btn7"));
    }

}