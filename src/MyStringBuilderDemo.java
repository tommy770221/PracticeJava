import java.util.Arrays;

public class MyStringBuilderDemo {

    public static void main(String[] args) {

        MyStringBuilder myStringBuilder=new MyStringBuilder();
        myStringBuilder=myStringBuilder.append("hello ");
        myStringBuilder=myStringBuilder.append("java");
        System.out.println("輸出字符串 "+myStringBuilder.toString());
        System.out.println("總容量大小 "+myStringBuilder.capacity());
        System.out.println("字符個數 "+myStringBuilder.length());
        System.out.println();

    }
}

class MyStringBuilder{

    private char [] value;
    private int count=0;

    public MyStringBuilder(){
        value=new char[16];
    }

    public MyStringBuilder(int capathity){
        value=new char[capathity];
    }

    public MyStringBuilder(String str){
        value=new char[str.length()+16];
    }

    public int length(){
        return count;
    }

    public int capacity(){
        return value.length;
    }

    public MyStringBuilder append(String str){
        int len=str.length();
        ensureCapacity(count+len);
        str.getChars(0,len,value,count);
        count+=len;
        return this;
    }

    public String toString(){

        return new String(value,0,count);
    }

    public void ensureCapacity(int capacity){
        if(capacity-value.length>0){
            int newCapacity=value.length*2+2;
            value= Arrays.copyOf(value,newCapacity);
        }
    }


}