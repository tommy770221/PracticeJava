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