package maths;

import java.util.Scanner;

public class PrimeNumbers {
	static Scanner scan = new Scanner(System.in);

	public static void prime(int n) {
		int i = 2;
		int count = 0;
		int dividorCounter = 0;
		
		System.out.println("\n The first " + n + " prime numbers : ");
		while (count < n) {
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					dividorCounter++;
				}
			}
			if (dividorCounter == 0) {
				System.out.print(" "+i );
				count++;
			}

			i++;
			dividorCounter = 0;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		System.out.print("Enter max number (0 to exit) : ");
		int n = scan.nextInt();
		
		while(n!=0) {
			prime(n);
			System.out.print("\n Enter max number (0 to exit) : ");
			n = scan.nextInt();
		}
		
	}
}
