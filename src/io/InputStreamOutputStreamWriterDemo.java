package io;

import java.io.*;

/**
 * Created by Tommy on 2018/10/23.
 */
public class InputStreamOutputStreamWriterDemo {

    public static void main(String[] args) throws IOException {
        FileOutputStream fos=new FileOutputStream("C:\\Users\\Tommy\\Pictures\\testOSW.txt");
        OutputStreamWriter osw=new OutputStreamWriter(fos,"utf-8");
        BufferedWriter bw=new BufferedWriter(osw);
        bw.write("你好");
        bw.close();

        BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\Tommy\\Pictures\\testOSW.txt"));
        String read=null;
        while((read=br.readLine())!=null){
            System.out.println(read);
        }
        br.close();

    }

}
