package com.attra.programs.javaString_Programs;

public class IsStringPalindrome {
    public static void main(String[] args)
    {
        String s1="ABA";
        String newString ="";
        String[] s2=s1.split("");
        for(int i=s2.length-1; i>=0;i--)
        {
        newString = newString+s2[i];
        }
//        System.out.print(newString);
        if(s1.equals(newString))
        {
            System.out.println("String is Palendrome :"+ newString);
        }
    }
}
