package org.task;

import java.util.Scanner;

public class PowerToDigit {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Base number");
		int base = s.nextInt();
		System.out.println("Enter Exponent number");
		int exponent = s.nextInt();
		int power = powermethod(base, exponent);
		System.out.println("Power of number: " + power);
	}

	private static int powermethod(int base, int exponent) {
		int count = 1;
		for (int i = 1; i <= exponent; i++) {
			count = count * base;
		}
		return count;
	}
}
