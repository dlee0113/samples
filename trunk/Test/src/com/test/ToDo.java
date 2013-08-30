package com.test;

import java.util.*;

public class ToDo {
	public static void main(String[] args) {
		String[] dogs = { "fido", "clover", "gus", "aiko" };
		List dogList = Arrays.asList(dogs);
		dogList.add("spot");
		dogs[0] = "fluffy";
		System.out.println(dogList);
		for (String s : dogs)
			System.out.print(s + " ");
		
		// This is new line of code
//		System.out.println("ToDo");
		
		System.out.println("hello");
	}
}
