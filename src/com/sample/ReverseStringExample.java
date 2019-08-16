package com.sample;

import java.util.Scanner;

public class ReverseStringExample {

    public static void main(String [] args){

        Scanner in = new Scanner(System.in);
        System.out.println("Enter string to reverse");
        String name = in.nextLine();
        String eman = null;
        for(int i=0 ; i<name.length()/2 ; i++){

            eman = name.replace(name.charAt(i), name.charAt(name.length()-(i+1)));

        }

        System.out.println("reversed string="+eman);
    }
}
