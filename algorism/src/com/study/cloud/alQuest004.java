package com.study.cloud;

import java.util.Scanner;

public class alQuest004 {

	static Scanner sc = new Scanner(System.in);
	static String n = "";
	
	
	public static void main(String[] args) {
		/*
		 * 펠린드롬 좌우 대칭되는 문자열 정렬
		 * 대문자 A-Z
		 */
		n = sc.nextLine();
		char[] a = new char[n.length()];
		int[] count = new int[26];
		String midTemp = "";
		String result = "";
		for (int i = 0; i < a.length; i++) {
			a[i] = n.charAt(i);
			count[(int)a[i]-65]++;
		}
		
		for (int i = 0; i < count.length; i++) {
			if (count[i]/2 > 0 ) {
				result+=midTemp;
				result += ((char)(i+65))+"";
				midTemp = "";
				count[i]--;
				count[i]--;
				i--;
			}else if (count[i] > 0) {
				result+=midTemp;
				midTemp = ((char)(i+65))+"";
			}
		}
		
//		System.out.println(result);
//		System.out.println(midTemp);
		result = result + midTemp + (new StringBuffer(result)).reverse().toString();
		
		System.out.println(result);
	}
	
	
	

}
