package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tommy on 2018/10/9.
 */
public class PrettyGirl implements IGirl {

    private List<IBoyFriend> iBoyFriends=new ArrayList<IBoyFriend>();

    private String msg="我生病了";

    @Override
    public void attachBoyFriend(IBoyFriend iBoyFriend) {
        iBoyFriends.add(iBoyFriend);
    }

    @Override
    public void removeBoyFriend(IBoyFriend iBoyFriend) {
        if(iBoyFriends.size()>0){
            iBoyFriends.remove(iBoyFriend);
        }
    }

    @Override
    public void notifyAllBoyFriends() {
        for(int i=0;i<iBoyFriends.size();i++){
            IBoyFriend iBoyFriend=iBoyFriends.get(i);
            iBoyFriend.update(msg);
        }
    }
}
