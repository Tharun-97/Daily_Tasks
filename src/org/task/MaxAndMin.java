package org.task;

public class MaxAndMin {

	public static int getMaxValue(int[][] numbers) {
		int maxvalue = numbers[0][0];
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				if (numbers[i][j] > maxvalue) {
					maxvalue = numbers[i][j];

				}
			}
		}
		return maxvalue;
	}

	public static int getMinValue(int[][] numbers) {
		int minvalue = numbers[0][0];
		for (int j = 0; j < numbers.length; j++) {
			for (int i = 0; i < numbers[j].length; i++) {
				if (numbers[j][i] < minvalue) {
					minvalue = numbers[j][i];

				}
			}
		}
		return minvalue;

	}
	public static void main(String[] args) {

		int arr1[][] = { { 11, 23, 3 }, { 27, 8, 19 }, { 45, 58, 61 } };
		System.out.println("Maximum value: " + getMaxValue(arr1));
		System.out.println("\nMinimum value: " + getMinValue(arr1));
	}

}
