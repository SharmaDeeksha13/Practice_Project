package com.attra.programs.javaString_Programs;

public class Remove_WhiteSpaces {
    public static void main(String [] args)
    {
        String s1= "Dee k    sha";
        String s2=s1.replaceAll(" ","");
        System.out.println(s2);
    }
}
