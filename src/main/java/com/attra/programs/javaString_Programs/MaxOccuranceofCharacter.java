package com.attra.programs.javaString_Programs;

import java.util.HashMap;
import java.util.Scanner;

public class MaxOccuranceofCharacter {

    public static void main(String[]args)
    {
int count =0;
Scanner sc =new Scanner(System.in);
System.out.println("Enter the string : ");
String str=sc.nextLine();

        HashMap<String,Integer> hmap=new HashMap<>();
        String[] s1=str.split("");
        for(String s2: s1)
        {
            if (hmap.containsKey(s2))
            {
                hmap.put(s2, hmap.get(s2)+1);
            }
            else
            {
                hmap.put(s2,1);
            }
        }
        System.out.println(hmap);

        for(String s3: hmap.keySet())
        {
            if(hmap.get(s3)>count)
            {
                count=hmap.get(s3);
            }

        }
        for(String s4 : hmap.keySet())
        {
            if(hmap.get(s4)==count)
            {
                System.out.println(s4);
            }
        }

    }
}
