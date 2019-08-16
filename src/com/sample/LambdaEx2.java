package com.sample;

public class LambdaEx2 {

    public static void main(String [] args){

        Output out = () -> System.out.println("hello");
        out.print();


    }
}

interface Output {

    void print();
}
