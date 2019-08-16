package com.sample;

public class LambdaEx1 {

    public static void main(String [] args){

        LambdaEx1 l = new LambdaEx1();
        Operation op = (a,b) -> a+b;
        l.print(op.sum(10,5));

    }
    void print(int x) {
        System.out.println(x);
    }
}


interface Operation {

    int sum(int a, int b);

}
