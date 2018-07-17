package com.study.cloud;

import java.util.Scanner;
import java.util.regex.Pattern;

public class alQuest005 {

	static Scanner sc = new Scanner(System.in);
	static String n = "";
	
	
	public static void main(String[] args) {
		n = sc.nextLine();
		search();
	}
	
	public static void search(){
		long ex = 64;
		int count = 6;
		int length = n.length();
		
		while (true) {
			ex = ex *2;
			String temp = ex+"";
			count ++;
			if (temp.length()-length>length) {
				if (n.equals(temp.substring(0, length))) {
					System.out.println(count);
					break;
				}
			}
			if (ex < 0) {
				System.out.println("X");
				break;
			}
		}
	}
	

}
