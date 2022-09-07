package com.bl.Day5;

import java.util.Scanner;

public class Coin_Flip {
	public static void main(String[] args) {
	    System.out.print("Enter the number of times to flip a coin ");
	    Scanner sc = new Scanner(System.in);

	    short numTimes = -5;
	    do {
	      numTimes = sc.nextShort();
	      if (numTimes < 0) {
	        System.out.print("Thats not valid. Enter again ");
	      }

	    } while (numTimes < 0);

	    byte headCount = 0;
	    byte tailCount = 0;

	    for (short i = 0; i < numTimes; i++) {
	      float random = (float) Math.random();
	      if (random < 0.50) {
	        System.out.print("Tails ");
	        tailCount++;
	      } else {
	        System.out.print("Heads ");
	        headCount++;
	      }
	    }

	    System.out.println("n");
	    System.out.println("Heads percent " + ((float) headCount / numTimes) * 100);
	    System.out.println("Tails percent " + ((float) tailCount / numTimes) * 100);
	    sc.close();
	  }

}
