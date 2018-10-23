package io;

import java.io.*;

/**
 * Created by Tommy on 2018/10/19.
 */
public class BufferedInputStreamOutputStreamDemo {

    public static void main(String[] args) {
        File file=new File("C:\\Users\\Tommy\\Pictures\\1604141930-ok.jpg");
        File fileCopy=new File("C:\\Users\\Tommy\\Pictures\\1604141930-okTT.jpg");
        try {
            FileUtil.copyFile(file,fileCopy);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

class FileUtil{
    public static void copyFile(File src, File desc) throws IOException {

        //* 方法二
        FileInputStream fileInputStream=new FileInputStream(src);
        FileOutputStream fileOutputStream=new FileOutputStream(desc);
        BufferedInputStream bufferedInputStream=new BufferedInputStream(fileInputStream);
        BufferedOutputStream bufferedOutputStream=new BufferedOutputStream(fileOutputStream);
        long time1=System.currentTimeMillis();
        int data=0;
        while((data= bufferedInputStream.read())!=-1){
            //用 bufferedOutputStream 會比較快
            bufferedOutputStream.write(data);
        }
        bufferedInputStream.close();
        bufferedOutputStream.close();
        long time2=System.currentTimeMillis();
        System.out.println("總共花費 : "+(time2-time1)+"毫秒" );

    }
}