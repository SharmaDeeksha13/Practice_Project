package com.attra.programs.javaString_Programs;

public class Vowels_Constant_InStrig {
    public static void main(String[] args)
    {
        String s1="ashoka";
        int count=0;
     String[] s2= s1.split("");
        {
            for(int i=0;i<=s1.length()-1;i++) {
                char c1 = s1.charAt(i);
                if (c1 == 'a' || c1 == 'e' || c1 == 'i' || c1 == 'o' || c1 == 'u') {
                    count ++;
                }

            }
            System.out.println("Number of vowels in the string is :"+ count);

        }
        {}

    }
}
