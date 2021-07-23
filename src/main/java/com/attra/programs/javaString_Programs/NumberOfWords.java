package com.attra.programs.javaString_Programs;

import java.util.HashMap;
import java.util.Scanner;

public class NumberOfWords {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String :");
        String s1 = sc.nextLine();
        String[] str =s1.split(" ");
        HashMap<String,Integer> hmap = new HashMap<>();
        for(String s2 :str)
        {
            if(hmap.containsKey(s2))
            {
                hmap.put(s2, hmap.get(s2)+1);
            }
            else
            {
                hmap.put(s2,1);
            }
        }
        System.out.println("hash Map is :" +hmap);

    }

}
