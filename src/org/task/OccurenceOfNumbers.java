package org.task;

import java.util.Arrays;

public class OccurenceOfNumbers {
	public static void main(String[] args) {
		int arr[] = {11,1,2,2,3,5,3,5,11,2};
		Arrays.sort(arr);
		System.out.println("The Given Array is:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				int num = arr[i];
				int count = 1;
				for (int j = i; j < arr.length - 1; j++) {
					if (num == arr[j + 1]) {
						arr[j + 1] = -arr[j + 1];
						count++;

					}

				}
				System.out.println("\n\n" + arr[i] + " " + "Count is" + " " + count);
			}
		}

	}
}
