package thread;

/**
 * Created by Tommy on 2018/10/18.
 */
public class HelloRunnableDemo {

    public static void main(String[] args) {
        HelloRunnable helloRunnableA=new HelloRunnable();
        Thread t1=new Thread(helloRunnableA,"A");
        t1.start();

        HelloRunnable helloRunnableB=new HelloRunnable();
        Thread t2=new Thread(helloRunnableB,"B");
        t2.start();

    }

}

class HelloRunnable implements Runnable{

    @Override
    public void run() {
        for(int i=0;i<50;i++){
             System.out.println(Thread.currentThread().getName()+": " +i);
        }
    }
}