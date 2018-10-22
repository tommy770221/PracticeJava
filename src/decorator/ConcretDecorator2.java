package decorator;

/**
 * Created by Tommy on 2018/10/19.
 */
public class ConcretDecorator2 extends Decorator{

    public ConcretDecorator2(Component component){
        super(component);
    }

    public void doThingA(){
        super.doThingA();
        doThingC();
    }

    private void doThingC(){
        System.out.println("do C thing");
    }
}
