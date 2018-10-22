package decorator;

/**
 * Created by Tommy on 2018/10/19.
 */
public class Decorator implements Component {
    private Component component=null;

    public Decorator(){}

    public Decorator(Component component){
        this.component=component;
    }

    @Override
    public void doThingA() {
        //調用被裝飾的方法
         component.doThingA();
    }
}
