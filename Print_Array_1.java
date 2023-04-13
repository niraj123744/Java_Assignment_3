package com.myprogram;

import java.util.Scanner;

public class Print_Array_1 {

	public static void main(String[] args) {
		// Accept the Array from User Input....

		int array[] = userInputArray(); // Obtaining the Array
		myArray(array); // Return Values array are passing in the
		// myArray Function.

	}

	// User Input Method
	private static int[] userInputArray() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];
		System.out.println("Enter the Array Elements");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		return a; // Returning the Array....

	}

	// Passing the Array as the Function to print...
	private static void myArray(int[] arr) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub

		// Looping through Array
		for (int i = 1; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}