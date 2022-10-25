package org.task;

import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50 };
		int last = arr.length - 1;
		System.out.println("The Given Array is: ");
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println("\nEnter the Search Element:");
		Scanner s = new Scanner(System.in);
		int key = s.nextInt();

		binarySearch(arr, 0, last, key);
	}

	private static void binarySearch(int[] arr, int i, int j, int key) {

		int mid = (i + j) / 2;
		while (i <= j) {
			if (arr[mid] < key) {
				i = mid + 1;
			} else if (arr[mid] == key) {
				System.out.println("Element is found at index: " + mid);
				break;
			} else {
				j = mid - 1;
			}
			mid = (i + j) / 2;
		}
		if (i > j) {
			System.out.println("Element is not found!");
		}

	}

}
