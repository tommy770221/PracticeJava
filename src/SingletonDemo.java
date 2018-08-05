public class SingletonDemo {

    public static void main(String[] args) {


    }

class Singleton{

    private  Singleton singleton;

    public synchronized Singleton getInstance() {

        if(this.singleton==null){
            singleton=new Singleton();
        }

        return singleton;
    }
}

}
