package io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Tommy on 2018/10/22.
 */
public class FileReaderFileWriterDemo {

    public static void main(String[] args) throws IOException {

        //FileReader 效能不好
        FileReader fileReader=new FileReader("C:\\Users\\Tommy\\Pictures\\aa.txt");
        FileWriter fileWriter=new FileWriter("C:\\Users\\Tommy\\Pictures\\bb.txt");
        char[] buffer=new char[100];
        int len=0;
        while ((len=fileReader.read(buffer))!=-1){
            fileWriter.write(buffer,0,len);
            //fileWriter沒有close的話 不會flush  預設是8k
            fileWriter.flush();
        }
        fileReader.close();
        fileWriter.close();

    }

}
