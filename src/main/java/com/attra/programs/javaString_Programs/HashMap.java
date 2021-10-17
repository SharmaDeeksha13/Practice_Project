package com.attra.programs.javaString_Programs;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
;

public class HashMap {

    public static void main(String[] args){
       List<String> a1= new ArrayList<>();
        List<String> a2= new ArrayList<>();
        Map<String,List<String>> map= new java.util.HashMap<>();
        a1.add("Deeksha");
        a1.add("XYZ");
        a2.add("Ashok");
        a2.add("abc");
        map.put("Name",a1);
        map.put("Lastname",a2);
        System.out.println(map);

    }
}
