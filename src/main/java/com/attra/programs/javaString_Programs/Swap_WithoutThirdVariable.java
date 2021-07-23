package com.attra.programs.javaString_Programs;

public class Swap_WithoutThirdVariable {
    public static void main(String[] args)
    {
        String s1="Deeksha";
        String s2="Sharma";

        s1=s1+s2;
        s2=s1.substring(7,13);
        System.out.println("s1- second String is :"+s2);
        s1=s1.substring(0,7);
        System.out.println("s2 -first string is :"+s1);

    }

}
