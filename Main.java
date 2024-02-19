/**
 *  Return true if the given non-negative number is a multiple of 3 or
 a multiple of 5.
or35(3) → true
or35(10) → true
or35(8) → false

 */
package com.technical;

import java.util.Scanner;
        public class Main
        {   static boolean or35(int x,int y)
            {
                boolean r=((x%3==0)||(y%5==0))?(true):(false);
                return r;
            }
        	public static void main(String[] args) 
        	{
        	    Scanner s=new Scanner(System.in);
        		int x,y;
        		x=s.nextInt();
        		y=s.nextInt();
        		boolean b=or35(x,y);	
        		System.out.println(b);
        		s.close();
        	}
        }
