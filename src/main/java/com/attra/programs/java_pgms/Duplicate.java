package com.attra.programs.java_pgms;

import java.util.HashMap;

public class Duplicate {

    public static void main(String[]args)
    {
        String s1 ="abcdceb";
        String[] str=s1.split("");
        int[] intArray = new int[]{ 1,5,4,6,4,7,5 };
        HashMap<Integer,Integer> hmap=new HashMap<>();
        for(int s2: intArray)
        {
            if(hmap.containsKey(s2))
            {

                hmap.put(s2,hmap.get(s2)+1);
                System.out.println(s2);
                    break;
            }
            else
            {
               hmap.put(s2,1);
            }


        }


        System.out.println(hmap);

        }
    }

