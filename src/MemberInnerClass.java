public class MemberInnerClass {
    public static void main(String[] args) {
         Outer1 outer1=new Outer1();
         Outer1.Inner1 inner1=outer1.new Inner1();
         inner1.outerShow();

    }
}

class Outer1{
    private String name="張三";
    private   int  num1=20;
    public void outerShow(){
        System.out.println(name);
        System.out.println(num1);
        Inner1 inner1=new Inner1();
        System.out.println(inner1.name);
    }

    public class Inner1{
        private String name="李四";
        private   int  num1=10;
        //內部類別不能用static
        public void outerShow(){
            System.out.println(name);
            System.out.println(num1);
            System.out.println(Outer1.this.name);//外部類存取
            Outer1.this.outerShow();
        }
    }

}
