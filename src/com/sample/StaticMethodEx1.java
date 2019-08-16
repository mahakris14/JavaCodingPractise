package com.sample;

public class StaticMethodEx1 {

    public static void main(String [] args){

        IStatic.staticMethod();
    }
}

interface IStatic {

    public static void staticMethod() {
        System.out.println("test");
        utilityMethod();
    }

    public static void utilityMethod() {
        System.out.println("utility");
    }
}
