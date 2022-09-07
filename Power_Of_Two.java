package com.bl.Day5;

import java.util.Scanner;

public class Power_Of_Two {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number");
		int num = sc.nextInt();

		System.out.println("Powers of Two upto " + num);

		for (int i = 1; i <= num; i++) {
			System.out.println(i + " " + (Math.pow(2, i)));
		}
		sc.close();
	}

}
