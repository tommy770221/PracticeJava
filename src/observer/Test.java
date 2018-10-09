package observer;

/**
 * Created by Tommy on 2018/10/9.
 */
public class Test {

    public static void main(String[] args) {
           ABoyFriend aBoyFriend=new ABoyFriend();
           BBoyFriend bBoyFriend=new BBoyFriend();
           CBoyFriend cBoyFriend=new CBoyFriend();

           PrettyGirl prettyGirl=new PrettyGirl();
           prettyGirl.attachBoyFriend(aBoyFriend);
           prettyGirl.attachBoyFriend(bBoyFriend);
           prettyGirl.attachBoyFriend(cBoyFriend);

           prettyGirl.notifyAllBoyFriends();
    }
}
