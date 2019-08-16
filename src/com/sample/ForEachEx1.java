package com.sample;

import java.util.Arrays;
import java.util.List;

public class ForEachEx1 {

public static void main(String [] args){

    ForEachEx1 ex = new ForEachEx1();
    List<Integer> list = Arrays.asList(1,2,3,4,5,6);
    ex.forEachBefore8(list);
    ex.forEachAfter8(list);

}

    private void forEachAfter8(List<Integer> list) {

    list.forEach((x)->System.out.println(x));


    }

    private void forEachBefore8(List<Integer> list) {

    for(int i : list){
        System.out.println(i);
    }
    }

}
