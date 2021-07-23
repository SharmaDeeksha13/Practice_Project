package com.attra.programs.javaString_Programs;

public class SumOfDigits_fromString {
    public static void main(String[] args)
    {
        String s1="Deeksh123a";
        int sum=0;
        char[] c1=s1.toCharArray();
        for(int i=s1.length()-1 ; i>=0; i--)
        {
    if(Character.isDigit(c1[i]))
    {
//        sum=sum+c1[i];
        System.out.println(c1[i]);
        sum=sum+Character.getNumericValue(c1[i]);
    }

        }
        System.out.println(sum);
    }
}
