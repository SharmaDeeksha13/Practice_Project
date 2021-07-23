package com.attra.programs.javaString_Programs;

public class ReverseTheString_PreserveInsertion {
    public static void main(String[] args)
    {
        String s1="America is a developed Country";
        String[] s2=s1.split(" ");
        String s4="";
        String s5=" ";
        for(String s3: s2)
        {
            char[] c1=s3.toCharArray();
            {
                for(int i=c1.length-1;i>=0;i--)
                {
                    char c4=c1[i];
                    s4=s4+Character.toString(c4);

                }
               s4=s4+s5;
            }
        }
        System.out.println(s4);


    }

}
