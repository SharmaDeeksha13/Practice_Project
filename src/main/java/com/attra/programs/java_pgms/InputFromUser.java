package com.attra.programs.java_pgms;

import java.util.Scanner;

public class InputFromUser {

    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter USerName : ");
        String UserName=obj.nextLine();
        System.out.println("User name entered by user is : "+ UserName);

    }
}
