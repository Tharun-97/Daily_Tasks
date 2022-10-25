package org.speed;

public class Speed {

	public void limit(int n) {

		switch (n) {
		case 1:
			System.out.println("Speed Range= 10-30Kmph");
			break;
		case 2:
			System.out.println("Speed Range= 30-50Kmph");
			break;
		case 3:
			System.out.println("Speed Range= 50-80Kmph");
			break;
		case 4:
			System.out.println("Speed Range= 80-110Kmph");
			break;

		case 5:
			System.out.println("Speed Range= 110-140mph");
			break;

		default:
			System.out.println("The Bike is in Neutral");
			break;
		}

	}
}
