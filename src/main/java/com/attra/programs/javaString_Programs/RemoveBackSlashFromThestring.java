package com.attra.programs.javaString_Programs;

public class RemoveBackSlashFromThestring {

    public static void main(String[] args)
    {
        String s1 = "0030051392 \\ A B CONTROLS AND TECHNOLOGY HUMBLE TX US 77338";
        String s2="";
        char[] c1= s1.toCharArray();
        for(int i=0;i<=c1.length-1;i++)
        {
            if(c1[i]=='\\')
            {

                continue;


            }
            else
            {
//              s2=s2+s1.charAt(i);
                s2=s2+Character.toString(c1[i]);
            }
        }
        String s3=s2.substring(12,19);
//        s3.replaceAll("Inc","");
        System.out.println(s3);

    }
}
