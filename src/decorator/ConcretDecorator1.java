package decorator;

/**
 * Created by Tommy on 2018/10/19.
 */
public class ConcretDecorator1 extends Decorator{

    public ConcretDecorator1(Component component){
        super(component);
    }

    public void doThingA(){
        super.doThingA();
        doThingB();
    }

    private void doThingB(){
        System.out.println("do B thing");
    }
}
