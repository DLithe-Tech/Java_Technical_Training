/**
 * Given integer x. Write a code to print its reverse.
ReverseOfx(123) → 321
ReverseOfx(-123) → -321
ReverseOfx(406) → 604.

 */

package assignment5;

import java.util.Scanner;

public class Assignment5_Problem02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Input
		int x = scanner.nextInt();

		// Reverse and print the result
		int reversed = reverseOfX(x);
		System.out.println(reversed);
		scanner.close();
	}

	static int reverseOfX(int x) {
		boolean isNegative = false;

		// Check if x is negative
		if (x < 0) {
			isNegative = true;
			x = Math.abs(x);
		}

		// Reverse the integer
		int reversed = 0;
		while (x > 0) {
			int digit = x % 10;
			reversed = reversed * 10 + digit;
			x /= 10;
		}

		// Add the sign back if the original number was negative
		if (isNegative) {
			reversed = -reversed;
		}

		return reversed;
	}
}




