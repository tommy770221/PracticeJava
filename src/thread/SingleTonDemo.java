package thread;

/**
 * Created by Tommy on 2018/10/19.
 */
public class SingleTonDemo {

    public static void main(String[] args) {

    }
}


class Singleton{

    private Singleton singleton=null;

    public Singleton getInstance(){
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