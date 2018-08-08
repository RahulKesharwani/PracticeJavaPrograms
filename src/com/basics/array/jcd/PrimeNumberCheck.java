package com.basics.array.jcd;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumberCheck {

	public boolean isPrime(int number) {
		boolean isPrimeNumber = true;
			if(number <= 1) {
				isPrimeNumber = false;
			}
			for(int i = 2; i<=number/2;i++) {
				if(number%i == 0) {
					isPrimeNumber = false;
					break;
				}
			}
		return isPrimeNumber;	
	}
	
	public List<Integer> listOfPrimeNumbers(int max){
		return this.listOfPrimeNumbers(2, max);
	}
	
	public List<Integer> listOfPrimeNumbers(int min, int max){
		List<Integer> arr = new ArrayList<Integer>();
		int i = min;
		while(i<max) {
			if(this.isPrime(i))
				arr.add(i);
			i++;
		}
		return arr;
	}
	
	public int sumOfPrimeNum(int min, int max) {
		List<Integer> arr = new ArrayList<Integer>();
		int i =  2;
		while(arr.size() < max) {
			if(this.isPrimeByRecursion(i)) {
				arr.add(i);
			}
			i++;
		}
		System.out.println(arr);
		Integer sum = arr.stream().reduce(0, (sumTillNow, b) -> (sumTillNow+b));
		return sum;
	}
	
	public boolean isPrimeByRecursion(int num) {
		return this.isPrimeByRecursion(num, num-1);
	}

	private boolean isPrimeByRecursion(int num , int secNum) {
		if(secNum == 1) {
			return true;
		}
		if(num < 2 || num%secNum == 0) {
			return false;
		}
		return isPrimeByRecursion(num, secNum-1);
	}
	public static void main(String[] args)
	{
		PrimeNumberCheck  prime = new PrimeNumberCheck();
		System.out.println(prime.sumOfPrimeNum(0, 5));
		
	}
}
