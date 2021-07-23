package com.attra.programs.javaString_Programs;

import com.sun.javafx.image.BytePixelSetter;

import java.util.Arrays;
import java.util.Scanner;

public class Annargam_viasortConcept {

    public static void main(String args[])
    {
        Scanner sc1= new Scanner(System.in);
        System.out.println("Enter first String : ");
String s1=sc1.nextLine();
String[] array1=s1.split("");

        Scanner sc2=new Scanner(System.in);
                System.out.println("Enter Second String Value : ");
                String s2=sc2.nextLine();
               String[] array2= s2.split("");
        Arrays.sort(array1);
        Arrays.sort(array2);

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        if(Arrays.toString(array1).equals(Arrays.toString(array2)))
        {
System.out.println("String is anargam");
        }
        else
        {
            System.out.println("Syring is not a anargam");
        }


    }
}
