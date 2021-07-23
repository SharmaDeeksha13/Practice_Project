package com.attra.programs.javaString_Programs;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class NonRepeated {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str = sc.nextLine();

        LinkedHashMap<String, Integer> hmap = new LinkedHashMap<>();
        String[] s1 = str.split("");
        for (String s2 : s1) {
            if (hmap.containsKey(s2)) {
                hmap.put(s2, hmap.get(s2) + 1);
            } else {
                hmap.put(s2, 1);
            }
        }
        System.out.println(hmap);
    for(String s2: hmap.keySet())
    {
        if(hmap.get(s2)==1)
        {
            System.out.println("First Non Repeated String :" +s2);
break;
        }

    }
        for(String s3: hmap.keySet())
        {

            if(hmap.get(s3)>1)
            {
                System.out.println("First  Repeated Character : "+ s3);
            }
        }
    }

}
