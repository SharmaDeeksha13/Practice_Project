package com.attra.programs.javaString_Programs;

import java.util.Arrays;
import java.util.Locale;

public class StringMethodsTest {

    public static void main(String[] args)
    {

        String s1 = "Deeksha";
        String s2= "Deeksha is a name";
        // I want the char value whixh is at 5th Index -h
        System.out.println("The Value is "+s1.charAt(5));

        // want to know the length of this above string
        System.out.println("The length is "+s1.length());

        // want to fetch the sequence  of characters which starts from 3rd index
        System.out.println("The substring is "+s1.substring(3));

        // want to fetch the sequence of characters as a substring
        System.out.println("Sub String is "+s1.substring(2,7));

        //Want to verify if  required string is a part of existing string or not
        System.out.println("given sequence of character is part of existing string :"+s1.contains("eeks"));

        // Want to compare two Strings
       System.out.println("Strings are equal or not: "+s1.equals("Deeksha"));

       // want to see is string Empty
        System.out.print("String is Empty or not :"+s1.isEmpty());

        // Want to replace a set of character
        String newvalue=s1.replace("ee","zz");
System.out.println("New Value is :  " +newvalue);

// Want to split the String value
       String[] str = s1.split("");
        System.out.println("Array of the String "+Arrays.toString(str));

        // I want to get a character which is allocated at specific index

        System.out.println("index value of character d :"+  s1.indexOf("D"));
        System.out.println("index value of character name :"+  s2.indexOf("name"));

        System.out.println("Index value of a character :" +s2.indexOf('a'));
        System.out.println("Index value of character a , and starting given position: "+s1.indexOf('a',5));

        String s3= "   Deeksha";
        System.out.println("length of a String : "+s3.length());
        System.out.println("Trim the string : "+s3.trim().length());

        //**************************************
        //How to trim a String which is have space and special chars

//
//        replaceAll("\\s","")
//\w = Anything that is a word character
//
//\W = Anything that isn't a word character (including punctuation etc)
//
//\s = Anything that is a space character (including space, tab characters etc)
//
//\S = Anything that isn't a space character (including both letters and numbers, as well as punctuation etc)
        String s4= "name=john age=13@# year=1998";
       String print1 = s4.replaceAll("\\W","");
        System.out.println("String value is : "+print1);

        String print2 = s4.replaceAll("\\w","");
        System.out.println("String 2nd value is : "+print2);

        String print3 = s4.replaceAll("\\s","");
        System.out.println("String 3rd value is : "+print3);

        String print4 = s4.replaceAll("\\S","");
        System.out.println("String 4th value is : "+print4);


    }
}
