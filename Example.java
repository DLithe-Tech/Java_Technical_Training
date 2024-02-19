/**
 * Given 2 int values, return whichever value is nearest to the value 10,
 or return 0 in the event of a tie. Note that Math.abs(n) returns the
 absolute value of a number.
close10(8, 13) → 8
close10(13, 8) → 8
close10(13, 7) → 0  //Both 13 and 7 are in the same distance from 10.

 */
package com.technical;

import java.util.Scanner;

public class Example {
	   static int close10(int x,int y)
	    {
	        int first_diff=Math.abs(x-10);
	        int second_diff=Math.abs(y-10);
	        int r=(first_diff<second_diff)?(first_diff):((first_diff>second_diff)?(second_diff):(0));
	        return r;
	    }
		public static void main(String[] args) 
		{
		    Scanner s=new Scanner(System.in);
			int x,y;
			x=s.nextInt();
			y=s.nextInt();
			int b=close10(x,y);	
			System.out.println(b);
			s.close();
		}

}
