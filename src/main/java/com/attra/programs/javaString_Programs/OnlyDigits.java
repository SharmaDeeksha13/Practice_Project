package com.attra.programs.javaString_Programs;

import java.util.Arrays;

public class OnlyDigits {
    public static void main(String[] args)
    {
String s1="deeksha13";
int sum=0;
char[] ch1=s1.toCharArray();
for(char c1 :ch1)
{
   if (Character.isDigit(c1))
   {
       System.out.println("This digit is part of String : "+ c1);

   }
//   else {
//       System.out.println("This digit is part of String : "+ c1);
//   }
}
    }
}
