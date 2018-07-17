package com.study.cloud;

import java.util.Scanner;
import java.util.regex.Pattern;

public class alQuest008 {

	static Scanner sc = new Scanner(System.in);
	static int km = 0;
	static int people = 0;
	static int speed[] ;
	
	
	public static void main(String[] args) {
		/*
		 * 대칭수 는 앞으로 읽어도 뒤로 읽어도 같은 수를 말한다 ex: 121
		 * 그렇다면 2진수 , 8진수 , 10진수로 표현하여도 모두 대칭수인 10이상의 최솟값은?
		 */
//		}
		
		int n = 10;
		do {
			if (check(n+"")) {
				if (check(binary(n))) {
					if (check(octal(n))) {
						break;
					}
				}
			}
			n++;
		} while (true);
		System.out.println(n + ", 2 : " + binary(n) + ", 8 : " + octal(n));
	}
	
	/**
	 * 2진법
	 * @param n
	 * @return
	 */
	public static String binary(int n){
		String temp = "";
		
		while (n >= 2) {
			temp = n%2 + temp;
			n = n/2;
		}
		temp = n%2 + temp;
		return temp;
	}
	/**
	 * 8진법
	 * @param n
	 * @return
	 */
	public static String octal(int n){
		String temp = "";
		
		while (n >= 8) {
			temp = n%8+temp;
			n = n/8;
		}
		temp = n%8+temp;
		return temp;
	}
	
	public static boolean check(String temp){
		boolean check = true;
		for (int i = 0; i < temp.length()/2; i++) {
//			System.out.println(temp.substring(i, i+1)+"] : ["+temp.substring(temp.length()-i-1, temp.length()-i));
			if (!temp.substring(i, i+1).equals(temp.substring(temp.length()-i-1, temp.length()-i))) {
				check = false;
				break;
			}
		}
		return check;
	}

}
