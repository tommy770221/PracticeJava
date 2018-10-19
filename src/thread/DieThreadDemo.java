package thread;

import com.sun.deploy.net.proxy.WIExplorerAutoProxyHandler;

/**
 * Created by Tommy on 2018/10/19.
 */
public class DieThreadDemo {

    public static void main(String[] args) {
           Example example=new Example();
           DieThread1 dieThread1=new DieThread1(example);
           dieThread1.start();
           DieThread2 dieThread2=new DieThread2(example);
           dieThread2.start();
    }
}


class DieThread1 extends Thread{

    private Example example=null;

    public DieThread1(){}

    public DieThread1(Example example){
          this.example=example;
    }

    public void run(){
        example.method1();
    }
}

class DieThread2 extends Thread{

    private Example example=null;

    public DieThread2(){}

    public DieThread2(Example example){
        this.example=example;
    }

    public void run(){
        example.method2();
    }
}



class Example{

    private Object object1=new Object();
    private Object object2=new Object();


    public void method1(){
        synchronized (object1){
            try {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName()+" : method1 Locking ...");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            synchronized (object2){
                System.out.println("method1");
            }

        }
    }

    public void method2(){
        synchronized (object2){
            try {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName()+" : method2 Locking ...");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            synchronized (object1){
                System.out.println("method2");
            }

        }
    }


}