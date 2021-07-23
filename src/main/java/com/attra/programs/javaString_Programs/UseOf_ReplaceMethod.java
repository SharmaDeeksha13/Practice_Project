package com.attra.programs.javaString_Programs;

public class UseOf_ReplaceMethod {

    public static void main(String[] args)
    {
        String s1= " Java is an@@ Object Oriented Language";
        // Conversion from old sequence of character to new sequence of character
        String str1=s1.replace("Object","OBJECT");
        System.out.println(str1);
        //Conversion from old character/s to new character/s
        String str2=s1.replace("Object","tcejbO");
        System.out.println(str2);
        //Conversion any regular Expression to any replacement
        String str3=s1.replaceAll("@","Z");
        System.out.println(str3);
        //Conversion first Regular expression to any replacement
        String str4=s1.replaceFirst("@","#");
        System.out.println(str4);
    }

}
