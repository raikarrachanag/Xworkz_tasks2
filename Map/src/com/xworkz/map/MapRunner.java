package com.xworkz.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapRunner {

    public static void main(String[] args) {
        Map<String, String> nameAndAadhar = new HashMap<>();
        
        nameAndAadhar.put("Rachana G Raikar", "999999999999");
        nameAndAadhar.put("Devayani", "888888888888");
        nameAndAadhar.put("Rachna", "777777777777");
        nameAndAadhar.put("Raikar", "666666666666");
        nameAndAadhar.put("Hema", "555555555555");
        nameAndAadhar.put("Saraswathi", "444444444444");
        nameAndAadhar.put("Devayni Raikar", "333333333333");
        nameAndAadhar.put("RG Raikar", "222222222222");
        nameAndAadhar.put("RGR", "111111111111");
        nameAndAadhar.put("Rachana GR", "999988887777");

        System.out.println(nameAndAadhar.isEmpty());

        System.out.println(nameAndAadhar.keySet());
        Set<String> a=nameAndAadhar.keySet();
        a.forEach(f->System.out.println(f));
        
        Collection<String> value=nameAndAadhar.values();
        value.forEach(v->System.out.println(v));
        
        
        
        
       //nameAndAadhar.forEach((key, value) -> { System.out.println(key + ": " + value);
       // });
        
        //System.out.println("==========================================");
        
        //nameAndAadhar.keySet().forEach(System.out::println);
        
       // System.out.println("==========================================");
        
        //nameAndAadhar.values().forEach(System.out::println);
        
    }
}
