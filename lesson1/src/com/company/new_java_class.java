package com.company;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by admin on 04.08.15.
 */
public class new_java_class {
    public static void main ( String[]args){
        ArrayList<Integer> a = new ArrayList<Integer>();
        System.out.println(a.size());
        a.add(10);
        System.out.println(a.size());


        int[] lol= {1,5,10};
        a.add(1);
        a.add(5);
        System.out.println(a.get(1));
        System.out.println(a.get(2));
        a.remove(0);
        System.out.println(a.size());
        Integer[] a1={1,2,10,20};
        a.addAll(Arrays.asList(a1));

    }


}
