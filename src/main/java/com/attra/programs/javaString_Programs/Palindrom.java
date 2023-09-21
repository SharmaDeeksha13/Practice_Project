package com.attra.programs.javaString_Programs;

import com.attra.programs.java_pgms.A;
import org.testng.annotations.Test;

import java.lang.reflect.Array;

public class Palindrom {


   public String a = "AMA";
   public String newString = "";

    @Test
    public void palindrom() {
        String[] a1 = a.split("");
        for (int i = a1.length - 1; i >= 0; i--) {
            newString = newString +a1[i] ;
            System.out.println(newString + +newString.length());
        }

        if(newString.equals(a))
        {System.out.println("String is palendrom");}
        else{
            System.out.println("String is not palendrom");
        }
    }
}
