package com.attra.programs.javaString_Programs;

import java.util.HashMap;
import java.util.Map;

public class Remove_Dupliactes {

    public static void main(String[] args)
    {
        String s1= "Deeeksha";
        String[] str=s1.split("");
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

        for(Map.Entry<String,Integer> entry : hmap.entrySet())
        {
            if(entry.getValue()>1)
            {
                System.out.println(entry.getKey() +":"+ entry.getValue());
            }

        }
        for(String s3: hmap.keySet())
        {
            if(hmap.get(s3)>1)
            {
                hmap.remove(s3,hmap.get(s3));
            }
        }



    }

}
