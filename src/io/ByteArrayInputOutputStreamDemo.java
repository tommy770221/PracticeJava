package io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by Tommy on 2018/10/19.
 */
public class ByteArrayInputOutputStreamDemo {

    public static void main(String[] args) throws IOException {

        String str = "hello, shanghi";
        ByteArrayInputStream bis=new ByteArrayInputStream(str.getBytes());
        int data=-1;
        while((data=bis.read())!=-1){
            System.out.println((char) data);
        }
        bis.close();

        ByteArrayOutputStream bos=new ByteArrayOutputStream();
        bos.write(65);
        bos.write(97);
        bos.write(str.getBytes());
        byte[] buff = bos.toByteArray();
        for(byte data2:buff){
            System.out.println((char) data2);
        }
        FileOutputStream fileOutputStream=new FileOutputStream("C:\\Users\\Tommy\\Pictures\\aa.txt",true);
        bos.writeTo(fileOutputStream);

        fileOutputStream.close();
        bos.close();

    }
}

