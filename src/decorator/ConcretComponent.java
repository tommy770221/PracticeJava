package decorator;

/**
 * Created by Tommy on 2018/10/19.
 */
public class ConcretComponent implements Component {
    @Override
    public void doThingA() {
        System.out.println("do Thing A ");
    }
}
