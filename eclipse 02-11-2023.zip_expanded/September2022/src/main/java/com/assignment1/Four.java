package com.assignment1;

public class Four {
//	A function returns 30, another function returns 50. 
//Write a java program which will display subtraction value from bigger number to smaller.
	
      public static void main(String[]args) {
	
    	  subtrction2nd(90,40);
    	  
    	  int subtrction;
    	  System.out.println("function returns value smaller number ="+ subtraction());
    	  
    	  int bigger;
    	  System.out.println("function returns value bigger number ="+ bigger());
    	  
}
       static int subtraction() {
       
    	   int a = 40;
    	   int b =	10;   
	       int c = a-b; 
	       return c = 30 ;
       }
       static int bigger() {
    	   
    	   int a = 90;
    	   int b = 40;
    	   int c = a-b;
    	   return c =50;
    	   
       }
       
       
       public static void subtrction2nd(int a, int b) {
    	   int subtrction = a-b;
    	   
    	   System.out.println("function returns value bigger number = "+subtrction);
       }
    }

