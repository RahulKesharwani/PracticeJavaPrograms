package com.javaconceptoftheday;

import java.util.Scanner;

public class SecondLargestNumber {

	private static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.print("Plese enter the number: ");
		int number = sc.nextInt();
		System.out.print("\n Please enter the digit: ");
		int digit = sc.nextInt();
		checkSecondLargestNumber(number, digit);
	}
	
	//http://javaconceptoftheday.com/how-to-find-largest-number-less-than-given-number-and-without-given-digit/
	public static void checkSecondLargestNumber(int number, int digit){
		for(int i=number; i>0;i--){
			if(!String.valueOf(i).contains(String.valueOf(digit))){
				System.out.println(i + " is the second largest number without given digit");
				break;
			}
		}
	}

}
