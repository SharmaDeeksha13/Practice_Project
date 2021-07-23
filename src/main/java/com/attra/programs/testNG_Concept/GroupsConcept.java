package com.attra.programs.testNG_Concept;

import org.testng.annotations.Test;

public class GroupsConcept {

    @Test(groups={"Sanity"})
    public void test1()throws Exception
    {
System.out.println("Sanity test case has been executed");
    }
    @Test(groups={"Smoke"})
            public void test2() throws Exception
    {
        System.out.println("Smoke testing is in progress");
    }

}
