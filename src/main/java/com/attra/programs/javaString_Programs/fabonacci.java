package com.attra.programs.javaString_Programs;

import org.testng.annotations.Test;

public class fabonacci {


  @Test
    public void ex()
  {
      int n0 = 0, n1 = 1, n2, i, count = 10;
      System.out.print(+n0 + " " + n1);
      for (i = 2; i < count; i++) {
          n2 = n0 + n1;
          System.out.print(" " + n2);
          n0 = n1;
          n1 = n2;
      }
  }
}
