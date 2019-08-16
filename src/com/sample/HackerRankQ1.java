package com.sample;

import java.util.*;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class HackerRankQ1 {

    public static void main(String [] args){

        List<Map> inputList = new ArrayList<Map>();
        HashMap map = null;
        Scanner in = new Scanner(System.in);
        for(int i=0 ; i<in.nextInt(); i++){

            String line = in.nextLine();
            String[] parts = Pattern.compile(" ").split(line);
            map.put(parts[0], parts[1]);
            inputList.add(map);

        }

       /*for(Map a : inputList){
           switch (a.getK)
       }*/

    }
}
