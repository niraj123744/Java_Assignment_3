package com.myprogram;

import java.io.*;

public class Largest_Array_3 {

	static int arr[] = { 10, 324, 45, 90, 9808 };

	static int largest() {
		int i;
		int max = arr[0];
		for (i = 1; i < arr.length; i++)
			if (arr[i] > max)
				max = arr[i];
		return max;
	}

	public static void main(String[] args) {
		System.out.println("largest in given array is " + largest());
	}
}
