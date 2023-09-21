package com.attra.programs.javaString_Programs;

import org.testng.annotations.Test;

public class Factorial {


    @Test
    public void palindrom() {

        int fact = 1;
        int nfactorialNumber = 4;
        for (int i = 1; i <= nfactorialNumber; i++) {
            fact = fact * i;
            System.out.println(fact);
        }
        System.out.println("Final Factorial Number is " + fact);
    }

}
