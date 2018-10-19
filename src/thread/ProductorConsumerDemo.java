package thread;

import java.util.LinkedList;


/**
 * Created by Tommy on 2018/10/19.
 */
public class ProductorConsumerDemo {

    public static void main(String[] args) {

        Bascket bascket=new Bascket();
        Productor productor=new Productor(bascket);
        Consumer consumer=new Consumer(bascket);
        productor.start();
        consumer.start();

    }

}


class Productor extends Thread{

    private Bascket bascket=null;

    public Productor(){}

    public Productor(Bascket bascket){
        this.bascket=bascket;
    }

    public void run(){
        bascket.pushApple();
    }

}

class Consumer extends Thread{

    private Bascket bascket=null;

    public Consumer(){}

    public Consumer(Bascket bascket){
        this.bascket=bascket;
    }

    public void run(){
        bascket.popApple();
    }

}

class Bascket{

    private LinkedList<Apple> bascket=new LinkedList<Apple>();

    //放四輪蘋果
    public synchronized void pushApple(){
        for(int i=1;i<21;i++){
            Apple apple=new Apple(i);
            push(apple);
        }
    }

    public synchronized void popApple(){
        for(int i=0;i<20;i++){
            pop();
        }
    }


    public void push(Apple apple){
        //當籃子當中放有5個蘋果就等待並通知消費者來消費
        if(bascket.size()==5){
            try{
                 wait();
            }catch (Exception e){
                e.printStackTrace();
            }//等待並釋放當前對象鎖
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        bascket.addFirst(apple);
        System.out.println("存放 : Apple "+apple.toString());
        notify();
    }

    public void pop(){
        //當籃子當中放有0個蘋果就等待並通知生產者來生產
        if(bascket.size()==0){
            try{
                wait();
            }catch (Exception e){
                e.printStackTrace();
            }//等待並釋放當前對象鎖
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Apple apple=bascket.removeFirst();
        System.out.println("吃掉 : Apple "+apple.toString());
        notify();
    }

}


class Apple{

    private int id;

    public Apple(){};

    public Apple(int id){
        this.id=id;
    };

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "id=" + id +
                '}';
    }
}