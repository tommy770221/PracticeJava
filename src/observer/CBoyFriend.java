package observer;

/**
 * Created by Tommy on 2018/10/9.
 */
public class CBoyFriend implements IBoyFriend {
    @Override
    public void update(String msg) {
        if("我生病了".equals(msg)){
            System.out.println("先等等,待會到");
        }
    }
}
