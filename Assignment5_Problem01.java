/**
 * We use the integers a, b, and n  to create the following series:
(a+2^0 *b),(a+2^0 *b+2^1*b) , (a+2^0 *b+2^1*b +2^2*b), …… (a+2^0 *b+2^1*b+2^2*b+....+2^n-1  * b)  
You are given  a, b, and n . For given a, b, and n print the series of numbers.
Constraint:
0<=a,b<=50
0<=n<=15
Output Format
print the corresponding series on a new line.
Sample Input
5 3 5
Sample Output
8 14 26 50 98

 */
package assignment5;

import java.util.Scanner;

public class Assignment5_Problem01
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Input
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int n = scanner.nextInt();

		// Generate and print the series
		int[] resultSeries = generateSeries(a, b, n);
		for (int value : resultSeries) {
			System.out.print(value + " ");
		}
		scanner.close();
	}

	static int[] generateSeries(int a, int b, int n) {
		int[] series = new int[n];
		int currentTerm = a;

		for (int i = 0; i < n; i++) {
			currentTerm += Math.pow(2, i) * b;
			series[i] = currentTerm;
		}

		return series;
	}
}
