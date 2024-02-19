/**
 * Given one integer n and return true if it is an even number else return false.

Even(6) -> True.
Even(7) -> False.
Even(9) -> False.

 */
package com.technical;

import java.util.Scanner;

public class EvenNumebrWithOutMod {
	  static boolean Even(int x)
      {
          boolean r=(x%2==0)?(true):(false);
          return r;
      }
  	public static void main(String[] args) 
  	{
  	    Scanner s=new Scanner(System.in);
  		int x;
  		x=s.nextInt();
  		boolean b=Even(x);	
  		System.out.println(b);
  		s.close();
  	}

}
