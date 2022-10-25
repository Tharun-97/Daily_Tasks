package org.speed;

import java.util.Scanner;

public class Gears extends Speed {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter the Gear: ");
		int n = s.nextInt();

		Gears g = new Gears();
		g.limit(n);

		System.out.println("If you want to apply brake: ");
		char a = s.next().charAt(0);

		if (a == 'y') {
			System.out.println("Gear is Reduced");
			g.limit(n - 1);
		} else if (a == 'n') {
			System.out.println("No Brake is applied");
		}
	}

}
