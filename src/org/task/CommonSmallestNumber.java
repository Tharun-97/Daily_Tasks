package org.task;

import java.util.Arrays;

public class CommonSmallestNumber {
	public static void main(String[] args) {
		int[] A = { 2, 10, 8, 4, 6, 9 };
		int[] B = { 8, 4, 11, 1, 2 };
		int[] C = { 6, 14, 8, 2, 4, 11 };
		Arrays.sort(A);
		Arrays.sort(B);
		Arrays.sort(C);
		System.out.println("The 3 Common Smallest Numbers are: ");
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < B.length; j++) {
				for (int k = 0; k < C.length; k++) {
					if (A[i] == B[j] && B[j] == C[k] && C[k] == A[i])
						System.out.print(A[i]+ " ");

				}
			}

		}
	}
}
