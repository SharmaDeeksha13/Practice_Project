package com.attra.programs.javaString_Programs;

import java.util.HashMap;

public class Duplicates_and_Occurance {

    public static void main(String args[])
    {
        String s1="Deeksha";
        String[] s2=s1.split("");
        HashMap<String,Integer> hmap =new HashMap<>();
        for(String str:s2) {
            if (hmap.containsKey(str)) {
                hmap.put(str, hmap.get(str) + 1);

            } else {
                hmap.put(str, 1);
            }
        }
        System.out.println(hmap);
    }


}
