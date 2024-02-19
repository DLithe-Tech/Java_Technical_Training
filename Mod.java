/**
 * Given two non-negative int values, return true if they have the same last digit, such as with 27 and 57. Note that the % "mod" operator computes remainders, so 17 % 10 is 7.

lastDigit(7, 17) → true
lastDigit(6, 17) → false   
lastDigit(3, 113) → true

 */
package com.technical;

import java.util.Scanner;

public class Mod {
	   static boolean lastDigit(int x,int y)
       {
           boolean r=((x%10)==(y%10))?(true):(false);
           return r;
       }
   	public static void main(String[] args) 
   	{
   	    Scanner s=new Scanner(System.in);
   		int x,y;
   		x=s.nextInt();
   		y=s.nextInt();
   		boolean b=lastDigit(x,y);	
   		System.out.println(b);
   		s.close();
   	}

}
