package org.task;

import java.util.Scanner;

public class EbBill {
	class EbBillInner {
		public void selection() {
			double bill = 0;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the units here: ");
			int unit = sc.nextInt();

			if (unit < 100) {
				bill = 100 * 0;
				System.out.println("Below 100 units - Free");
			} else if (unit < 300) {
				bill = (unit - 100) * 2;
			} else if (unit < 400) {
				bill = (unit - 100) * 3;
			} else if (unit > 400) {
				bill = (unit - 100) * 4;
			}

			System.out.println("\nBill Amount: " + bill);
		}
	}

	public static void main(String[] args) {
		EbBill in = new EbBill();
		EbBill.EbBillInner inp = in.new EbBillInner();
		inp.selection();
	}

}
