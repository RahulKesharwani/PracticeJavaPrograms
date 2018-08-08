package com.basics.array.jcd;

import java.util.Arrays;

/**
 * @link : 
 * @author Rahul
 *
 */
public class ArrayRotation {
	
	enum Rotation{
		LEFT,
		RIGHT;
	}
	private Integer[] numbers;
	
	public ArrayRotation(Integer[] numbers) {
		this.numbers = numbers;
	}
	
	public void rotate(Rotation rotation, int place) {
		Integer[] temp = new Integer[place];
		int arrLen = numbers.length;
		if(place > arrLen) {
			return;
		}
		switch(rotation) {
		case LEFT:
			for(int i=0; i<place;i++) {
				temp[i] = numbers[i];
			}
			for(int i = place;i<arrLen;i++) {
				numbers[i-place] = numbers[i];
			}
			for(int i = arrLen - place, j = 0;i<arrLen;i++,j++) {
				numbers[i] = temp[j];
			}
			
			break;
		case RIGHT:
			for(int i = arrLen-place, j = 0;i<arrLen;i++) {
				temp[j++] = numbers[i];
			}
			for(int i = arrLen-place-1; i>=0; i--) {
				numbers[i+place] = numbers[i];
			}
			for(int i = 0; i < place;i++) {
				numbers[i] = temp[i];
			}
			
			break;
		default:
			System.out.println("This is default option");
		}
		System.out.println(Arrays.toString(numbers));
		
		
	}
	public static void main(String[] args) {
		Integer[] arr = {10,20,30,40,50,60};
		ArrayRotation ar = new ArrayRotation(arr);
		ar.rotate(Rotation.LEFT, 2);
		
	}

}
