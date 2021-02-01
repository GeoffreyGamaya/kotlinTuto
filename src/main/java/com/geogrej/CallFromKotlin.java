package com.geogrej;

import org.geogre.GenericsKt;
import org.geogre.Guy;

public class CallFromKotlin {

     public static void main(String[] args) {
         Guy bob = new Guy("bob", "dylan", 34);
         System.out.println("employee is " + bob.getFname());

         Integer maxVal1 = GenericsKt.max(12, 33);
         String maxVal2 = GenericsKt.max("aa", "bb");
         System.out.println(maxVal1);
         System.out.println(maxVal2);
     }

}
