package com.myprogram;

import java.util.Scanner;

public class Smallest_Element_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int total, i, small;
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the Size of Array: ");
		total = scan.nextInt();
		int[] arr = new int[total];
		System.out.print("Enter " + total + " Numbers: ");
		for (i = 0; i < total; i++)
			arr[i] = scan.nextInt();

		small = arr[0];
		for (i = 1; i < total; i++) {
			if (small > arr[i])
				small = arr[i];
		}

		System.out.println("\nSmallest Number = " + small);
	}
}
