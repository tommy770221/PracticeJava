public class LocalInnerClass {

    public static void main(String[] args) {
          Outer3 outer3=new Outer3();
          outer3.showOuter();

    }
}

class Outer3{

    private String name="張三";
    private int num1=10;
    private static int num2=20;

    public void showOuter(){
        final int num4=50;
        class Inner3{
            private int num3=30;
            private int num1=10;
            public void showInner(){
                System.out.println(num3);
                System.out.println(num1);
                System.out.println(num2);
                System.out.println(Outer3.this.num1);
                System.out.println(Outer3.num2);
                //num4必須定義為final
                System.out.println(num4);
            }

        }
        //當方法運行完 局部內部類就死光了
        Inner3 inner=new Inner3();
        inner.showInner();

    }



}
