package io;

import java.io.*;

/**
 * Created by Tommy on 2018/10/22.
 */
public class BufferReaderWriterDemo {

    public static void main(String[] args) throws IOException {

        FileReader fr=new FileReader("C:\\Users\\Tommy\\Pictures\\test.java");
        FileWriter fw=new FileWriter("C:\\Users\\Tommy\\Pictures\\test2.java");
        BufferedReader br=new BufferedReader(fr);
        BufferedWriter bw=new BufferedWriter(fw);
        String line=null;
        while ((line=br.readLine())!=null){
            bw.write(line);
            bw.newLine();//換行
            // BufferedWriter 沒有close的話 不會flush  預設是8k
            // bw.flush();
        }
        br.close();
        bw.close();

    }

}
