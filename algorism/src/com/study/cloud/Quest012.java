package com.study.cloud;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Quest012 {

	public static void main(String[] args) {
		String input = "";
		Scanner sc = new Scanner(System.in);

		input = whileNumberInserting(sc.nextLine());
		sort(input);
		
	}
	
	public static void sort(String input){
		String[] SUFFIXES = new String[input.length()];
		
		for (int i = 0; i <SUFFIXES.length; i++) {
			SUFFIXES[i] = input.substring(i, SUFFIXES.length);
		}
		
		Arrays.sort(SUFFIXES);
		
		for (int i = 0; i < SUFFIXES.length; i++) {
			System.out.println(SUFFIXES[i]);
		}
	}
	
	public static boolean insertCheck(String input){
		return Pattern.matches("^[a-z]*$",input);
	}
	
	public static String whileNumberInserting(String insert) {
		String result = "";
		Scanner sc = new Scanner(System.in);
		boolean numberCheck = false;

		while (!numberCheck) {

			numberCheck = insertCheck(insert);

			if (numberCheck)
				result = insert;
			else
				insert = sc.next();
		}

		return result;

	}

}
