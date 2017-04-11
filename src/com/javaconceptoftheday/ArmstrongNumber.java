package com.javaconceptoftheday;

public class ArmstrongNumber {

	public static void main(String[] args) {
		long number = 0;
		while(number++ < 99999999){
			checkAramstrongNumber(number);
		}

	}
	
	public static void checkAramstrongNumber(long number){
		int noOfDigits = String.valueOf(number).length();
		long copyOfNumber = number;
		double sum = 0;
		while(copyOfNumber != 0){
			long lastDigit = copyOfNumber%10;
			sum = sum + Math.pow(lastDigit,  noOfDigits);
			copyOfNumber /= 10;
		}
		if(sum != 0 && sum == number ){
			System.out.println(sum + "is an Armstrong Number");
		}
	}

}
