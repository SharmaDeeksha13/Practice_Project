package com.attra.programs.javaString_Programs;

public class RemoeWhiteSpace_WithoutInbuild {

    public static void main(String[] args)
    {
        String s1 = "deek sha  z";
        String s2="";
      char[] c1= s1.toCharArray();
      for(int i=0;i<=c1.length-1;i++)
      {
          if(c1[i]==' ')
          {
              continue;


          }
          else
          {
//              s2=s2+s1.charAt(i);
              s2=s2+Character.toString(c1[i]);
          }
      }
      System.out.println(s2);
    }


}
