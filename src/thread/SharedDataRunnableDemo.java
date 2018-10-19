package thread;

/**
 * Created by Tommy on 2018/10/18.
 */
public class SharedDataRunnableDemo {
    public static void main(String[] args) {
        ShareRunnable shareRunnable=new ShareRunnable();
        Thread threadA=new Thread(shareRunnable,"一號窗口");
        Thread threadB=new Thread(shareRunnable,"二號窗口");
        threadA.start();
        threadB.start();
        //要小心重複賣掉票
    }
}


class ShareRunnable implements Runnable{

    private int ticket=5;

    @Override
    public void run() {

        while (true){
             System.out.println(Thread.currentThread().getName()+": "+ticket--);
             if(ticket<1){
                 break;
             }
        }
    }
}