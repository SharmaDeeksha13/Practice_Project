package com.attra.programs.java_pgms.ExceptionHandling_Concept;

public class Return_Concept {
    public static void main(String[] args) {
        Return_Concept obj1= new Return_Concept();
       System.out.println( obj1.test());
    }

    public int test()
    {
        try {
            System.out.println("I am in try");
int i=5/0;
            return 0;
        } catch (Exception ex) {
            System.out.println("I am in Catch");
return 1;

        } finally {

            System.out.println("Inside finally");


        }
    }
}