/**
 * Given 2 ints, a and b, return true if one of them is 10 or if their sum is 10.

makes10(9, 10) → true
makes10(9, 9) → false
makes10(1, 9) → true

 */
package com.technical;

import java.util.Scanner;

public class Main1 {
	static boolean makes10(int x,int y)
    {
        boolean r=((x+y==10)||x==10||y==10)?(true):(false);
        return r;
    }
	public static void main(String[] args) 
	{
	    Scanner s=new Scanner(System.in);
		int x,y;
		x=s.nextInt();
		y=s.nextInt();
		boolean b=makes10(x,y);	
		System.out.println(b);
		s.close();
	}

}
