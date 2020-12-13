package com.attra.programs.javaString_Programs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Anargam {
    public static void main(String[] arga)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter String :");

       String str= sc.nextLine();
       System.out.println("String entered by user is :" +str);

        Scanner sc1=new Scanner(System.in);
        System.out.println("Please enter second String :");

        String str1= sc.nextLine();
        System.out.println("String entered by user is :" +str1);

        HashMap<String,Integer> hmap= new HashMap<>();
        String[] s1=str.split("");
        for(String s:s1)
        {
            if(hmap.containsKey(s))
            {
                hmap.put(s,hmap.get(s)+1);

            }else
            {
             hmap.put(s,1);
            }
        }
        System.out.println("first hash map is : "+hmap);


        HashMap<String,Integer> hmap2= new HashMap<>();
        String[] st =str1.split("");
        for(String t1:st)
        {
            if(hmap2.containsKey(t1))
            {
                hmap2.put(t1,hmap2.get(t1)+1);
            }
            else
            {
                hmap2.put(t1,1);
            }
        }
        System.out.println("Second hash map is :" +hmap2);
        if(hmap.equals(hmap2))
        {
            System.out.println("String is Anargam");

        }
        else
        {
            System.out.println("String is not a Anargam");
        }
    }

}
