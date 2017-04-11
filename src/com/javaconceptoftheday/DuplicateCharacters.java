package com.javaconceptoftheday;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class DuplicateCharacters {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		String str = sc.nextLine();
		findDuplicateLetter(str); 
		
	}
	
	public static void findDuplicateLetter(String str){
		HashMap<Character, Integer> countCharMap = new HashMap<>();
		for(Character ch : str.toCharArray()){
			if(countCharMap.containsKey(ch)){
				countCharMap.put(ch, countCharMap.get(ch)+1);
			}else{
				countCharMap.put(ch, 1);
			}
		}
		Set<Character> keySetOfChar = countCharMap.keySet();
		for(Character ch : keySetOfChar){
			System.out.println(ch+": "+ countCharMap.get(ch));
		}
	}
	
	

}
