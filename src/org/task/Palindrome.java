package org.task;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int ip = sc.nextInt();
		int number = ip, rem = 0;
		while (ip > 0) {
			rem = (rem * 10) + ip % 10;
			ip = ip / 10;
		}
		if (number == rem) {
			System.out.println("The Given number is Palindrome");
		} else {
			System.out.println("The Given number is not a Palindrome");
		}
	}
}
