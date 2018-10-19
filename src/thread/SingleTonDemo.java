package thread;

/**
 * Created by Tommy on 2018/10/19.
 */
public class SingleTonDemo {

    public static void main(String[] args) {

        ThreadDemo threadDemo1=new ThreadDemo();
        ThreadDemo threadDemo2=new ThreadDemo();
        threadDemo1.start();
        threadDemo2.start();

    }
}

class ThreadDemo extends Thread{

    public void run(){
        Singleton singleton=Singleton.getInstance();
    }
}

class Singleton{

    public Singleton(){
        System.out.println("創建 Singleton");
    }

    private static Singleton singleton=null;

    public static Singleton getInstance(){
        if(singleton==null){
            synchronized (Singleton.class){
                if(singleton==null){
                    singleton=new Singleton();
                }
            }
        }
        return singleton;
    }

}