package org.task;

public class SelectionSort {
	public static void main(String[] args) {
		int arr[] = { 11, 5, 12, 7, 6 };
		int temp = 0;
		selectionSort(arr, temp);
	}

	static void selectionSort(int arr[], int temp) {

	 System.out.println("Before Sorting: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[j] < arr[i]) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
	 System.out.println("\nAfter Sorting: ");
		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i] + " ");
		}

	}

}
