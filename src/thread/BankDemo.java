package thread;

/**
 * Created by Tommy on 2018/10/18.
 */
public class BankDemo {

    public static void main(String[] args) {

        Bank bank=new Bank();
        BankThread bankThread1=new BankThread(bank);
        bankThread1.start();
        BankThread bankThread2=new BankThread(bank);
        bankThread2.start();

    }

}

class BankThread extends Thread{
    private Bank bank=null;
    public BankThread(Bank bank){
        this.bank=bank;
    }

    public void run(){
        System.out.println("取錢 : "+bank.getMoney(400));
    }
}

class Bank{

    private int money=500;

    public synchronized int getMoney(int number){
        if(number<0){
           return -1;
        }else if(money<0){
           return -2;
        }else if(money-number<0){
            return -3;
        }else{
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
            money-=number;
            System.out.println("餘額 : "+money);
        }
        return number;
    }

}