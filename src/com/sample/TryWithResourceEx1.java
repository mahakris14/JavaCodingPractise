package com.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TryWithResourceEx1 {

    public static void main(String [] args){

        TryWithResourceEx1 ex = new TryWithResourceEx1();
        ex.printBeforeJava9();
        ex.printAfterJava9();

    }

    public void printBeforeJava9() {

        FileInputStream in = null;
        File f = new File("/usr/maha/file.txt");
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

    public void printAfterJava9() {

        FileInputStream in = null;
        File f = new File("/usr/maha/file.txt");
        try {
            in = new FileInputStream(f);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        finally {
            try {
                    in.close();
                }catch (IOException i){
                    i.printStackTrace();
                }
            }

    }
}
