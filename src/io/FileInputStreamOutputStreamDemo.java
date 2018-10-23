package io;

import java.io.*;

/**
 * Created by Tommy on 2018/10/19.
 */
public class FileInputStreamOutputStreamDemo {

    public static void main(String[] args) {
        File file=new File("C:\\Users\\Tommy\\Pictures\\食神.jpg");
        File fileCopy=new File("C:\\Users\\Tommy\\Pictures\\食神TT.jpg");
        try {
            FileCopyUtil.copyFile(file,fileCopy);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

class FileCopyUtil{
    public static void copyFile(File src, File desc) throws IOException {
        // 方法1
        FileInputStream fileInputStream=new FileInputStream(src);
        FileOutputStream fileOutputStream=new FileOutputStream(desc);
        long time1=System.currentTimeMillis();
        int data=-1;

        while((data= fileInputStream.read())!=-1){
            fileOutputStream.write(data);
        }
        fileInputStream.close();
        fileOutputStream.close();
        long time2=System.currentTimeMillis();
         System.out.println("總共花費 : "+(time2-time1)+"毫秒" );


        /* 方法二
        FileInputStream fileInputStream=new FileInputStream(src);
        FileOutputStream fileOutputStream=new FileOutputStream(desc);
        byte[] bytes=new byte[1024*1024];//創造1MB的緩衝區 ;
        long time1=System.currentTimeMillis();
        int len=0;
        while((len= fileInputStream.read(bytes))!=-1){
            fileOutputStream.write(bytes,0,len);
        }
        fileInputStream.close();
        fileOutputStream.close();
        long time2=System.currentTimeMillis();
        System.out.println("總共花費 : "+(time2-time1)+"毫秒" );*/

    }
}