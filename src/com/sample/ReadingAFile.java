package com.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadingAFile {

    public static void main(String [] args){

        ReadingAFile.beforeJAVA7();
        ReadingAFile.afterJAVA7();

    }

    private static void beforeJAVA7()  {

        File f = new File("/usr/maha/file.txt");
        FileInputStream in = null;
        try {
            in = new FileInputStream(f);
        }catch(IOException e){
            e.printStackTrace();
        }finally {
            try {
                in.close();
            }catch (IOException i){
                i.printStackTrace();
            }
        }


    }

    private static void afterJAVA7() {

        String filename = "/usr/maha/file.txt";
        try {
            Path path = Paths.get(filename);
            String contents = new String(Files.readAllBytes(path));
        }catch(IOException e){
            e.printStackTrace();
        }

    }
}
