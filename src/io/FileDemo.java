package io;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

/**
 * Created by Tommy on 2018/10/19.
 */
public class FileDemo {

    public static void main(String[] args) {

        File file=new File("C:\\Users\\Tommy\\Pictures");
        String[] files=file.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".png");
            }
        });

        for(String fileName:files){
            System.out.println(fileName);
        }

        File[] dirList=file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isDirectory();
            }
        });

        for(File dir:dirList){
            System.out.println(dir.getName());
        }

    }

}
