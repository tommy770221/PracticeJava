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
public class CardLayoutDemo {

    public static void main(String[] args) {
         MyFrame6 myFrame6=new MyFrame6("CardLayoutDemo");
         myFrame6.init();
         System.out.println();
    }

}

class MyFrame6 extends Frame{

    public MyFrame6(String title){
        super(title);
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
        System.out.println(lb_1.getText());
        lb_2=new Label("第二頁內容",Label.CENTER);
        tf_content=new TextField("");
        lb_3=new Label("第三頁內容",Label.CENTER);
        lb_4=new Label("第四頁內容",Label.CENTER);

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
}