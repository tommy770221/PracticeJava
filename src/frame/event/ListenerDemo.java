package frame.event;

import javafx.stage.*;
import sun.awt.WindowClosingListener;

import java.awt.*;
import java.awt.event.*;
import java.awt.event.WindowEvent;

/**
 * Created by Tommy on 2018/10/5.
 */
public class ListenerDemo {

    public static void main(String[] args) {
         MyFrame7 myFrame7=new MyFrame7("ListenerDemo");
         System.out.println();
    }

}

class MyFrame7 extends Frame{

    public MyFrame7(String title){
        super(title);
        init();
        registeListener();
    }

    private Panel card_panel=null;
    private Panel ctrol_panel=null;
    private CardLayout cardLayout=null;
    private FlowLayout flowLayout=null;
    private Label lb_1,lb_2,lb_3,lb_4;
    private Button btn_first,btn_previous,btn_next,btn_last;
    private TextField tf_content;

    public void init(){
        this.setVisible(true);
        this.setSize(400,300);
        this.setBackground(Color.WHITE);
        cardLayout=new CardLayout();
        flowLayout=new FlowLayout();
        card_panel=new Panel();
        ctrol_panel=new Panel();
        card_panel.setLayout(cardLayout);
        ctrol_panel.setLayout(flowLayout);

        lb_1=new Label("第一頁內容",Label.CENTER);
       // System.out.println(lb_1.getText());
        lb_2=new Label("第二頁內容",Label.CENTER);
        tf_content=new TextField("");
        lb_3=new Label("第三頁內容",Label.CENTER);
        lb_4=new Label("第四頁內容",Label.CENTER);

        lb_1.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                super.mouseMoved(e);
                lb_1.setText(String.valueOf(e.getX())+","+String.valueOf(e.getY()));
            }
        });

        lb_2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                System.out.println("滑鼠移入");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                System.out.println("滑鼠移出");
            }
        });

        tf_content.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                System.out.println(e.getKeyCode());
                System.out.println(e.getKeyChar());
            }
        });

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);
            }
        });

        card_panel.add(lb_1);
        card_panel.add(lb_2);
        card_panel.add(tf_content);
        card_panel.add(lb_3);
        card_panel.add(lb_4);

        btn_first=new Button("第一張");
        btn_last=new Button("最後一張");
        btn_previous=new Button("上一張");
        btn_next=new Button("下一張");

        ctrol_panel.add(btn_first);
        ctrol_panel.add(btn_previous);
        ctrol_panel.add(btn_next);
        ctrol_panel.add(btn_last);

        this.add(card_panel,BorderLayout.CENTER);
        this.add(ctrol_panel,BorderLayout.SOUTH);

    }

    private void registeListener(){
        BtnListener btnListener=new BtnListener();

        btn_first.addActionListener(btnListener);
        btn_previous.addActionListener(btnListener);
        btn_next.addActionListener(btnListener);
        btn_last.addActionListener(btnListener);
    }

    class BtnListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println(e.getActionCommand());
            System.out.println(e.getSource());

            Object object=e.getSource();
            if(object==btn_first){
                cardLayout.first(card_panel);
            }else if(object==btn_previous){
                cardLayout.previous(card_panel);
            }else if(object==btn_next){
                cardLayout.next(card_panel);
            }else if(object==btn_last){
                cardLayout.last(card_panel);
            }

        }


    }
}

