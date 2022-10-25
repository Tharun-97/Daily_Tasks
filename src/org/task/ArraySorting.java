package org.task;

public class ArraySorting{
	public static void main(String[] args) {

		int numbers[][] = { { 10, 30, 12 }, { 56, 35, 40 }, { 23, 15, 8 } };

		System.out.println("2D-Array Before Sorting: \n");
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				System.out.print(numbers[i][j] + " ");
			}
			System.out.println();
		}

		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				for (int k = 0; k < numbers.length; k++) {
					for (int l = 0; l < numbers[k].length; l++) {
						int temp = 0;
						if (numbers[k][l] > numbers[i][j]) {
							temp = numbers[i][j];
							numbers[i][j] = numbers[k][l];
							numbers[k][l] = temp;
						}
					}

				}
			}

		}
     
		System.out.println("\n2D-Array After Sorting: \n");
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				System.out.print(numbers[i][j] + " ");
			}
			System.out.println();
		}
	}
}
