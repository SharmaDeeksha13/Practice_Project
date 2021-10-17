package com.attra.programs.java_pgms;

import java.util.*;

public class Test {
    public static void main(String args[]) {
//        System.out.println("I am ready");

//     LinkedHashMap<String,List<String>> hmap=new LinkedHashMap<>();
        boolean status = has();
        System.out.println(status);
    }

    public static boolean has() {

        LinkedHashMap<String, List<String>> hmap = new java.util.LinkedHashMap<>();
        List<String> l1 = new ArrayList<>();
        l1.add("123");
        l1.add("234");
        l1.add("567");
        hmap.put("Sharma", l1);
        hmap.put("Ashok", l1);
        System.out.println(hmap);


        Iterator<String> itr = hmap.keySet().iterator();
        while (itr.hasNext()) {
            String key = itr.next();
            System.out.println(key);
            if (key.equals("Sharma")) {
                List<String> luu = hmap.get(key);
                for (String liii : luu) {
                    System.out.println(liii);
                    if (liii.equals("hhh")) {
                    }

                }
            }
        }

        return true;
    }
}