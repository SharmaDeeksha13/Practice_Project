package com.attra.programs.java_pgms;

import java.util.HashMap;

public class A {

    public static void main(String[] args)
    {
        String s1="Deeeksha";
        int count =2;
       String[] str= s1.split("");
        HashMap<String,Integer> hmap=new HashMap<>();
        for(String str1 :str)
        {
            if(hmap.containsKey(str1))
            {
                hmap.put(str1,hmap.get(str1)+1);
            }
            else
            {
                hmap.put(str1,1);
            }
        }
        System.out.println(hmap);

        for(String s2:hmap.keySet())
        {
            if(hmap.get(s2)>count)
            {
                System.out.println("Repeated Char: " + s2);
                System.out.println("true");
                break;
            }
            else
            {
                System.out.println("False");
            }
        }







    }
}
