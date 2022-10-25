package org.task;

import java.util.Scanner;
public class Armstrong {


	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number");
			int arm = 0, number,rem;
			int num = sc.nextInt();
			number = num;
			int i = 0;
			while (num > 0) {
				num = num / 10;
				i++;
				
			}
			num = number;
			while (num > 0) {
				rem = num % 10;
				arm = (int) (arm + Math.pow(rem,i));
				num=num/10;
				
			}

			if (arm == number) {
				System.out.println("Armstrong");
			} else {
				System.out.println("Not a Armstrong");
			}

		}

	}


