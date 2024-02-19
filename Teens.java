/**
 * We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 3 int values, return true if 1 or more of them are teens.

hasTeen(13, 20, 10) → true
hasTeen(20, 19, 10) → true
hasTeen(20, 10, 13) → true

 */
package com.technical;

import java.util.Scanner;

public class Teens {
	 static boolean hasteen(int x,int y,int z)
	    {
	        boolean a=(((x>=13)&&(x<=19))||((y>=13)&&(y<=19))||((z>=13)&&(z<=19)))?(true):(false);
	        return a;
	    }
		public static void main(String[] args) 
		{
		    Scanner s=new Scanner(System.in);
			int x,y,z;
			x=s.nextInt();
			y=s.nextInt();
			z=s.nextInt();
		    boolean b=hasteen(x,y,z);	
			System.out.println(b);
			s.close();
		}

}
