package com.myprogram;

public class Print_Even_Position_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declare and initialize the array elements
		int num[] = { 12, 5, 77, 14, 91, 21, 1 };
		System.out.println("Even position of elements present in an array are: ");

		// logic implementation
		for (int i = 1; i < num.length; i = i + 2) {
			System.out.print(num[i] + " ");
		}
	}
}
