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
public class BorderLayoutDemo {

    public static void main(String[] args) {
        MyFrame4 myFrame4=new MyFrame4("BorderLayout");
        myFrame4.init();
    }


}


class MyFrame4 extends Frame{

    public MyFrame4(String title){
        super(title);
    }

    public void init(){
        this.setBounds(50,50,300,300);
        this.setBackground(Color.CYAN);
        this.setVisible(true);
        this.add(new Button("North"),BorderLayout.NORTH);
        this.add(new Button("Center"),BorderLayout.CENTER);
        this.add(new Button("SOUTH"),BorderLayout.SOUTH);
        this.add(new Button("EAST"),BorderLayout.EAST);
        this.add(new Button("WEST"),BorderLayout.WEST);
    }

}