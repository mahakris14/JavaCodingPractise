package com.sample;

import java.util.function.Predicate;

public class PrintOddNumberUsingLambda {

    private static boolean isOdd(Predicate<Integer> p, int i){
        return p.test(i);
    }

    public static void main(String [] args){

        Predicate<Integer> p = (i) -> i%2 > 0;
        System.out.println(p.test(25));

    }
}
