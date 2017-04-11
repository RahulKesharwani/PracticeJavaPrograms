package com.javaconceptoftheday;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DuplicateNumberInArrayList {

	private static final String HASHMAP_VALUE = "VALUE";

	public static void main(String[] args) {
		findDuplicateElement();
		
	}
	
	public static void findDuplicateElement(){
		List<String> list2 = new ArrayList<>();
		list2.add("abc");
		list2.add("def");
		list2.add("ghi");
		list2.add("abc");
		list2.add("kasd");
		list2.add("adsfkd");
		list2.add("ghi");
		HashMap<String, String> hashMap = new HashMap<>();
		
		for (String string : list2) {
			if(hashMap.containsKey(string)){
				System.out.println(string + " - is a duplicate value");
			}
			hashMap.put(string, HASHMAP_VALUE);
		}
		
	}

}
