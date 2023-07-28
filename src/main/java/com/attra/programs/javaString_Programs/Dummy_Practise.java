package com.attra.programs.javaString_Programs;

import java.util.HashMap;

public class Dummy_Practise {
    public static void main(String[] args) {
        // Print Occurance of each character.
        String s2="Deeksha";
        String[] str1=s2.split("");
        java.util.HashMap<String,Integer> hmap= new HashMap<String,Integer>();
        for(String strr:str1)
        {
            if(hmap.containsKey(strr))
            {
                hmap.put(strr,hmap.get(strr)+1);
            }else{
                hmap.put(strr,1);
            }
        }
        System.out.println(hmap);
    }
}
