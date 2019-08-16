package com.sample;

public class MultiCatchDemo {

    public static void main(String [] args){

        MultiCatchDemo m1 = new MultiCatchDemo();
        m1.catchBeforeJava7();
        m1.catchAfterJava7();
    }

    private void catchBeforeJava7() {

        try {
            int result = 100 / 0;
            System.out.println("output=" + result);
        }catch(ArithmeticException e){
            System.out.println("Arithmetic Exception:"+e.getMessage());
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Index Exception:"+ e.getMessage());
        }

    }

    private void catchAfterJava7() {

        try {
            int result = 100 / 0;
            System.out.println("output=" + result);
        }catch(ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println("===Exception:"+ e.getMessage());
        }
    }
}
