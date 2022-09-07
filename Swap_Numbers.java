package com.bl.Day5;

import java.util.Scanner;

public class Swap_Numbers {
	public static void main(String[] args) {

		int temp;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st number");
		int num1 = sc.nextInt();

		System.out.print("Enter 2nd number");
		int num2 = sc.nextInt();

		System.out.print("x=" + num1 + " and y=" + num2);

		temp = num1;
		num1 = num2;
		num2 = temp;

		System.out.println("After swapping: " + num1 + "   " + num2);
		System.out.print("x=" + num1 + " and y=" + num2);
		sc.close();
	}
}
