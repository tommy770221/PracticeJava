package notepad;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Tommy on 2018/10/10.
 */
public class NotePadDemo {

    public static void main(String[] args) {
        MyFrame myFrame=new MyFrame("記事本");
    }

}

class MyFrame extends JFrame{

    private JTextArea jTextArea=null;
    private JScrollPane jScrollPane=null;
    private JMenuBar jMenuBar=null;
    private JMenu m_file=null;
    private JMenu m_help=null;
    private JMenuItem item_new=null;
    private JMenuItem item_open=null;
    private JMenuItem item_exit=null;
    private JMenuItem item_about=null;

    public MyFrame(String title){
        super(title);
        init();
        registerListener();
    }

    public void init(){
        jTextArea=new JTextArea();
        jScrollPane=new JScrollPane(jTextArea);
        jScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        Container container=this.getContentPane();
        container.add(jScrollPane,BorderLayout.CENTER);
        this.setSize(500,300);

        jMenuBar=new JMenuBar();
        m_file=new JMenu("文件");
        item_new=new JMenuItem("新建");
        item_open=new JMenuItem("打開");
        item_exit=new JMenuItem("離開");
        m_file.add(item_new);
        m_file.add(item_open);
        m_file.add(item_exit);
        m_help=new JMenu("幫助");
        item_about=new JMenuItem("關於");
        m_help.add(item_about);
        jMenuBar.add(m_file);
        jMenuBar.add(m_help);
        this.setJMenuBar(jMenuBar);


        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Toolkit kit=Toolkit.getDefaultToolkit();
        Dimension dimension=kit.getScreenSize();
        int screenWidth=dimension.width;
        int screenHeight=dimension.height;
        int windowsWidth=this.getWidth();
        int wimdowsHeight=this.getHeight();
        this.setLocation((screenWidth-windowsWidth)/2,(screenHeight-wimdowsHeight)/2);

    }

    public void registerListener(){
             item_new.addActionListener(new ActionListener() {
                 @Override
                 public void actionPerformed(ActionEvent e) {
                         newFile();
                 }
             });

             item_open.addActionListener(new ActionListener() {
                 @Override
                 public void actionPerformed(ActionEvent e) {
                         openFile();
                 }
             });

             item_exit.addActionListener(new ActionListener() {
                 @Override
                 public void actionPerformed(ActionEvent e) {
                         exit();
                 }
             });

             item_about.addActionListener(new ActionListener() {
                 @Override
                 public void actionPerformed(ActionEvent e) {
                     new AboutDialog(MyFrame.this,"關於記事本",true);
                 }
             });
    }

    private void newFile(){
        if(!"".equals(jTextArea.getText())){
                int res=JOptionPane.showConfirmDialog(null,"是否保存?","提示信息",JOptionPane.YES_NO_OPTION);
            if(res==JOptionPane.YES_OPTION){
                FileDialog fileDialog=new FileDialog(this,"保存文件", FileDialog.SAVE);
                fileDialog.setVisible(true);
            }else{
                jTextArea.setText("");
            }
        }

    }

    private void openFile(){
        FileDialog fileDialog=new FileDialog(this,"打開文件", FileDialog.LOAD);
        fileDialog.setVisible(true);
    }

    private void exit(){
        newFile();
        System.exit(0);
    }

    private void about(){

    }

}

class AboutDialog extends JDialog{
    private JLabel desc=null;
    private JPanel panel=null;
    private JButton button=null;

    public AboutDialog(Frame frame,String title,boolean modal){
        super(frame,title,modal);
         init();
         registerListener();
    }


    private void init(){

        desc =new JLabel();
        desc.setText("<html>這是一個新開發的程式<br>還請多多包涵</html>");
        desc.setHorizontalAlignment(JLabel.CENTER);
        panel=new JPanel();
        button=new JButton("ok");
        panel.add(button);
        this.add(desc);
        this.add(panel,BorderLayout.SOUTH);
        this.setSize(300,150);

        Toolkit kit=Toolkit.getDefaultToolkit();
        Dimension dimension=kit.getScreenSize();
        int screenWidth=dimension.width;
        int screenHeight=dimension.height;
        int dialogWidth=this.getWidth();
        int  dialogHeight=this.getHeight();
        this.setLocation((screenWidth- dialogWidth)/2,(screenHeight- dialogHeight)/2);
        this.setVisible(true);
    }

    private void registerListener(){
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AboutDialog.this.dispose();
            }
        });
    }
}