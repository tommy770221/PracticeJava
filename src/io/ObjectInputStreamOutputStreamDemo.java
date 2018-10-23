package io;

import java.io.*;

/**
 * Created by Tommy on 2018/10/22.
 */
public class ObjectInputStreamOutputStreamDemo{

    public static void main(String[] args) throws IOException {

        // 小心 local class incompatible: stream
        // classdesc serialVersionUID = -5648872801500410101,
        // local class serialVersionUID = 2601305040847523057

       /* FileOutputStream fos=new FileOutputStream(new File("C:\\Users\\Tommy\\Pictures\\testObj.txt"));
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        Student stu=new Student("張三",30);
        oos.writeObject(stu);
        oos.close();*/

        FileInputStream fis=new FileInputStream(new File("C:\\Users\\Tommy\\Pictures\\testObj.txt"));
        ObjectInputStream ois=new ObjectInputStream(fis);
        try {
            Student studentOis = (Student) ois.readObject();
            System.out.print(studentOis);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        ois.close();
    }

}

class Student implements Serializable{

    private static final long serialVersionUID = -3825377042338072327L;
    private String name;
    private int age;
    private String address;

    public Student(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}