public class EnumDemo {

    public static void main(String[] args) {

        System.out.println(Color.BLUE);
        //System.out.println(Color.BLUE); 等同於
        //System.out.println(Color.BLUE.toString());
        Color[] colors=Color.values();
        for(Color color:colors){
            System.out.println(color);
        }

        System.out.println(Person1.P1);

    }


    /*當jvm 去加載枚舉類時會預先創建枚舉類的多個對象供外部類使用
     *
     */
    //public static final Color  BlUE=new Color()
    //public static final Color   RED=new Color()
    //public static final Color GREEN=new Color()
    enum Color{
        BLUE,RED,GREEN;
        private Color(){
            System.out.println("構造方法");
        };

        public String toString(){
            return "aa";
        }

    }

}
//public static final Person1  P1=new Person1("張三",30)
//public static final Person1  P2=new Person1("李四",20)
//public static final Person1  P3=new Person1("王五",18)
enum Person1{

    P1("張三",30),P2("李四",20),P3("王五",18);

    private String name;
    private int age;

    Person1(String name,int age){
        this.name=name;
        this.age=age;
    }

    public String toString(){
        return name+"--"+age;
    }

}