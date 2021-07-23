package com.attra.programs.javaString_Programs;

import java.lang.reflect.Array;

public class Reverse_without_Inbuild
{
    public static void main(String[] args)
    {
        String s1= "Deeksha";
        char[] c=s1.toCharArray();
        for(int i=c.length-1 ; i>=0;i--)
        {
                System.out.print(c[i]);
        }
    }
}
