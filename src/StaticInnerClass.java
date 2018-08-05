public class StaticInnerClass {
    public static void main(String[] args) {
         Outer2.Inner2 inner2=new Outer2.Inner2();
         inner2.outerShow();



    }
}

class Outer2{
    private static String name="張三";
    private   int  num1=20;
    public  void outerShow(){
        System.out.println(name);
        System.out.println(num1);
        Inner2 inner2=new Inner2();
        System.out.println(inner2.name);
    }

    public static class Inner2{
        private String name="李四";
        private   int  num1=10;
        private static int num3=30;
        //內部類別不能用static
        public void outerShow(){
            System.out.println(name);
            System.out.println(num1);

            System.out.println(Outer2.name);//外部類存取
            //靜態內部類不能訪問非靜態外部類的成員
            //Outer2.this.outerShow();
        }
    }

}
