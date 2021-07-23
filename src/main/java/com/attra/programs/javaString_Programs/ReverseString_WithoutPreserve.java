package com.attra.programs.javaString_Programs;

public class ReverseString_WithoutPreserve {
    public static void main(String[] args)
    {
        String s1= "India is a country";
        String str="";
       char[] c1= s1.toCharArray();
       for(int i=c1.length-1;i>=0;i--)
       {
            str=Character.toString(c1[i]);
           System.out.print(str);
       }

    }
}
