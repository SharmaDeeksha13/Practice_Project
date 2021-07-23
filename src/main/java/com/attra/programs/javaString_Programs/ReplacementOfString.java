package com.attra.programs.javaString_Programs;

public class ReplacementOfString {
    public static void main(String[] args)
    {
        String s1= "America is a developed Country";
        String[] str=s1.split(" ");
        System.out.println(s1.replace("developed","Rich"));

        String s2 ="Dee ksha @";
        System.out.println(s2.replaceAll("\\W","")); // remove space and special chars
        System.out.println(s2.replaceAll("\\w","").length()); // single single characters
        System.out.println(s2.replaceAll("\\s",""));// remove spaces only
        System.out.println(s2.replaceAll("\\S","").length()); // remove everything but not spaces
    }
}
