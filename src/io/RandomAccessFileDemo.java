package io;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

/**
 * Created by Tommy on 2018/10/23.
 */
public class RandomAccessFileDemo {

    public static void main(String[] args) throws IOException {

        Person personA=new Person("aa",30);
        Person personB=new Person("bb",20);
        Person personC=new Person("cc",40);
        Person personD=new Person("dd",60);
        Person[] people=new Person[]{personA,personB,personC,personD};
        RandomAccessFile randomAccessFile=new RandomAccessFile("C:\\Users\\Tommy\\Pictures\\testRandom.txt","rw");

        for(int i=0;i<people.length;i++){
            randomAccessFile.writeChars(people[i].getName());
            randomAccessFile.writeInt(people[i].getAge());
            System.out.println(people[i].getName()+" : "+people[i].getAge());
        }
        Scanner scanner=new Scanner(System.in);
        System.out.println("獲取第幾個對象?");
        int num=scanner.nextInt();
        System.out.println("獲取第 "+num+" 個對象");
        //用seek方法查找存取位置
        randomAccessFile.seek(((num-1)*Person.size()));
        System.out.println(randomAccessFile.getFilePointer());
        Person personAns=new Person();
        personAns.setName(readName(randomAccessFile));
        personAns.setAge(randomAccessFile.readInt());
        System.out.println("姓名 : "+personAns.getName());
        System.out.println("年齡 : " +personAns.getAge());
        randomAccessFile.close();

    }

    private static String readName(RandomAccessFile randomAccessFile) throws IOException{
        char[] name=new char[15];
        for(int i=0;i<name.length;i++){
            name[i]=randomAccessFile.readChar();
        }

        return new String(name).replace('\u0000',' ');
    }
}

class Person{

    private String name;
    private int age;

    public Person(){}

    public Person(String name, int age) {
        StringBuilder builder=null;
        if(name!=null){
            builder=new StringBuilder(name);
        }else{
            builder=new StringBuilder(15);
        }
        builder.setLength(15); //固定長度為15個字符, 佔30個字節 \u0000
        this.name = builder.toString();
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //每個對象所佔的字節數
    public static int size(){
        return 34;
    }
}