package com.simple;

import java.util.Scanner;

public class Tester {   

   public static void main (String[] args)
   {

       int testNum;
       int[] testCases;

       Scanner in = new Scanner(System.in);

       System.out.println("Enter test number");
       testNum = in.nextInt();

       testCases = new int[testNum];

       int i = 0;

       System.out.println(in.hasNext());
       while(i < testNum) {
           System.out.println("Hi");
    	   testCases[i] = in.nextInt();
           i++;
       }

       for(Integer t : testCases) {
           if(t != null)
               System.out.println(t.toString());               
       }

   } 

} 