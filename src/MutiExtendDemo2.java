public class MutiExtendDemo2 {

    public static void main(String[] args) {
          Son son=new Son();
          son.show();
          son.show2();

    }

}

abstract class Parent{
    public abstract void show();
}

interface Ishow{
    public abstract void show();
}

class Son extends Parent{
    public void show(){
        System.out.println("抽象類中的show方法");
    }

    private class Inner2 implements Ishow{
        public void show(){
            System.out.println("抽象介面中的show方法");
        }
    }

    public void show2(){
        new Inner2().show();
    }

}