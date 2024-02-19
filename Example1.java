/**
 * Given 2 int values, return true if either of them is in the range 10..20 inclusive.

in1020(12, 99) → true
in1020(21, 12) → true
in1020(8, 99) → false

 */
package com.technical;

import java.util.Scanner;

public class Example1 {
	   static boolean in1020(int x,int y)
       {
           boolean r=((x>=10 && x<=20)||(y>=10 && y<=20))?(true):(false);
           return r;
       }
   	public static void main(String[] args) 
   	{
   	    Scanner s=new Scanner(System.in);
   		int x,y;
   		x=s.nextInt();
   		y=s.nextInt();
   		boolean b=in1020(x,y);	
   		System.out.println(b);
   		s.close();
   	}

}
