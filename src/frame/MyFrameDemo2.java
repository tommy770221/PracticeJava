package frame;

import java.awt.*;

/**
 * Created by Tommy on 2018/9/26.
 */
public class MyFrameDemo2 {

    public static void main(String[] args) {
          FrameDemo2 frameDemo2=new FrameDemo2("這是標題");
          frameDemo2.init();
    }
}


class FrameDemo2 extends Frame {
    public FrameDemo2(String title) {
        super(title);
    }

    public void init(){
        this.setSize(500,500);
        this.setBackground(Color.BLUE);
        this.setVisible(true);
        this.setLayout(null);//去掉視窗的佈局管理器
        Panel panel=new Panel();
        panel.setLayout(null); //去除panel原本的佈景模式
        panel.setBounds(0,0,300,300);
        panel.setBackground(Color.BLACK);
        Button button=new Button("Click me");
        button.setBackground(Color.cyan);
        button.setBounds(0,0,100,100);
        panel.add(button);
        this.add(panel);
    }
}