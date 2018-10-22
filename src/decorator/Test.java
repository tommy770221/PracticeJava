package decorator;

/**
 * Created by Tommy on 2018/10/19.
 */
public class Test {

    public static void main(String[] args) {
        ConcretComponent concretComponent=new ConcretComponent();
        ConcretDecorator1 concretDecorator1=new ConcretDecorator1(concretComponent);
        concretDecorator1.doThingA();
        ConcretDecorator2 concretDecorator2=new ConcretDecorator2(concretDecorator1);
        concretDecorator2.doThingA();

    }
}
