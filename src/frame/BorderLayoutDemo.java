

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