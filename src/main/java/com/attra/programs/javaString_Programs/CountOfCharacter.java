package com.attra.programs.javaString_Programs;

import java.util.HashMap;
import java.util.Scanner;

public class CountOfCharacter {

    public static void main(String[] args)
    {
        //Taking input from end-User
        Scanner sc= new Scanner(System.in);
        System.out.println("Eneter the String : ");
         String s1 =sc.next();
String[] str=s1.split("");
        HashMap<String,Integer> hmap= new HashMap<>();
        for(String str1 : str)
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

    }
}
