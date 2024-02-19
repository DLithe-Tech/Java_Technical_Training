/**
 * Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.

diff21(19) → 2
diff21(10) → 11
diff21(21) → 0
diff21(22) -> 2

 */
package com.technical;

import java.util.Scanner;

public class Operator_Question_1 
{  
	static int diff21(int n)
{
	int x=(n<21)?(Math.abs(n-21)):(2*Math.abs(n-21));
	return x;
}

public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int x=diff21(n);
	System.out.println(x);
	s.close();
}

}
