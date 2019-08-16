package com.sample;

public class Java12Interface implements Java9Features {

    public static void main(String [] args){

        Java9Features.someStaticMethod();
        Java9Features j = new Java12Interface();
        j.someMethod();

        Java9Features j9 = () -> System.out.println("absMethod");
        j9.absMethod();
    }

    @Override
    public void absMethod() {

    }
}

interface Java9Features {

    default void someMethod() {

        print("default method");
    }

    static void someStaticMethod() {

        System.out.println("static method");
    }

    private void print(String msg){
        System.out.println(msg);
    }



    public  void absMethod() ;


}