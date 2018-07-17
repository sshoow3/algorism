package com.study.cloud;

import java.util.Scanner;
import java.util.regex.Pattern;

public class alQuest006 {

	static Scanner sc = new Scanner(System.in);
	static String n = "";
	
	
	public static void main(String[] args) {
		//ox 채점
		n = sc.nextLine();
		int count = 1;
		int result = 0;
		for (int i = 0; i < n.length(); i++) {
//			System.out.println(n.substring(i, i+1) +" : " +((n.charAt(i) =='o')) );
			if (n.charAt(i) =='o') {
				result += count++;
			}else {
				count = 1;
			}
		}
		System.out.println(result);
	}
	
	

}
