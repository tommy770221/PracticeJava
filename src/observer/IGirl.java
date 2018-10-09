package observer;

/**
 * Created by Tommy on 2018/10/9.
 */
public interface IGirl {

    public void attachBoyFriend(IBoyFriend iBoyFriend);

    public void removeBoyFriend(IBoyFriend iBoyFriend);

    public void notifyAllBoyFriends();

}
