package thread;

/**
 * Created by Tommy on 2018/10/18.
 */
public class HelloThreadDemo {

    public static void main(String[] args) {

        HelloThread helloThread1=new HelloThread();
        HelloThread helloThread2=new HelloThread();
        helloThread1.setName("Thread1 名字");
        helloThread2.setName("Thread2 名字");
        helloThread1.start();
        helloThread2.start();

    }
}


class HelloThread extends Thread{

    public void run(){
        for(int i =0; i < 50; i++){
            System.out.println(this.getName()+":"+i);
        }
    }

}