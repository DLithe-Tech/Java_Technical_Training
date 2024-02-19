/**
 * Given two int values, return their sum. Unless the two values are the same, then return double their sum.

sumDouble(1, 2) → 3
sumDouble(3, 2) → 5
sumDouble(2, 2) → 8

 */
package com.technical;

import java.util.Scanner;

public class SumDouble {
	   static int SumDouble1(int x,int y)
       {
           int r=(x!=y)?(x+y):(2*(x+y));
           return r;
       }
   	public static void main(String[] args) 
   	{
   	    Scanner s=new Scanner(System.in);
   		int x,y;
   		x=s.nextInt();
   		y=s.nextInt();
   		int b=SumDouble1(x,y);	
   		System.out.println(b);
   		s.close();
   	}

}
