package com.attra.programs.javaString_Programs;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Anargam2 {
    // Second Logic
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter first String :");
        String st1 = s1.nextLine();

        Scanner s2 = new Scanner(System.in);
        System.out.println("Enter Second String :");
        String st2 = s2.nextLine();

        String str1 = st1.toLowerCase();
        String str2 = st2.toLowerCase();
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        if(ch1.length==ch2.length)
        {
            Arrays.sort(ch1);
            Arrays.sort(ch2);

            boolean isEqual=Arrays.equals(ch1,ch2);

            if(isEqual)
            {System.out.println("String is Anargam");
            }
            else {
                System.out.println("String is not Anargam") ;
            }
        }

    }


}
