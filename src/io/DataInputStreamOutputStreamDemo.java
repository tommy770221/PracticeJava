package io;

import java.io.*;

/**
 * Created by Tommy on 2018/10/19.
 */
public class DataInputStreamOutputStreamDemo {

    public static void main(String[] args) throws IOException {
        String name="張三";
        int age=30;
        boolean flag=true;
        char sex='男';
        double money = 100.56;

        DataOutputStream dataOutputStream=new DataOutputStream(new FileOutputStream(new File("C:\\Users\\Tommy\\Pictures\\bb.txt")));
        dataOutputStream.writeUTF(name);
        dataOutputStream.writeInt(age);
        dataOutputStream.writeBoolean(flag);
        dataOutputStream.writeChar(sex);
        dataOutputStream.writeDouble(money);
        dataOutputStream.close();

        DataInputStream dataInputStream=new DataInputStream(new FileInputStream(new File("C:\\Users\\Tommy\\Pictures\\bb.txt")));
        //順序必須讀寫一致
        System.out.println(dataInputStream.readUTF());
        System.out.println(dataInputStream.readInt());
        System.out.println(dataInputStream.readBoolean());
        System.out.println(dataInputStream.readChar());
        System.out.println(dataInputStream.readDouble());
        dataInputStream.close();


    }

}
