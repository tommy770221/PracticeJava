package observer;

/**
 * Created by Tommy on 2018/10/9.
 */
public class ABoyFriend implements IBoyFriend {
    @Override
    public void update(String msg) {
        if("我生病了".equals(msg)){
            System.out.println("我馬上到");
        }
    }
}
