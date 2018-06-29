package com.study.cloud;

import java.util.Scanner;
import java.util.regex.Pattern;
//https://edu.goorm.io/learn/lecture/790/%EC%A0%9C1%ED%9A%8C-%EA%B5%AC%EB%A6%84%EC%BD%94%EB%93%9C%EC%B1%8C%EB%A6%B0%EC%A7%80-gcc-%EA%B8%B0%EC%B6%9C-%EB%AC%B8%EC%A0%9C/lesson/29959/%ED%8F%89%EA%B7%A0%EA%B3%BC-%ED%8F%89%EA%B7%A0%EB%B3%B4%EB%8B%A4-%ED%81%B0-%EC%88%98
public class Quest007 {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int n = whileNumberInserting(sc.next());
		int[] arr= new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = whileNumberInserting(sc.next());
		}
		
		view(arr);
  }
	
	public static void view(int[] arr){
		int total = 0;
		for (int i = 0; i < arr.length; i++) {
			total += arr[i];
		}
		float avg =  ((float) total / (float)arr.length);
//		System.out.println(avg);
		
		int count = 0;
		for (int i = 0; i < arr.length; i++) {	if (avg < (float)arr[i]) 	count ++; }
		
		System.out.printf("%.1f %d",avg , count);
	}
	
	public static boolean numberCheck(String num) {

		boolean check = Pattern.matches("^*[0-9]*$", num);
		if (!check)
			check = Pattern.matches("^*[-1-9]*$", num);
		if (!check)
			System.out.print("입력하신건 숫자가 아닙니다. 다시 입력해주세요:");
		return check;
	}

	public static int whileNumberInserting(String insert) {
		int result = 0;
		Scanner sc = new Scanner(System.in);
		boolean numberCheck = false;

		while (!numberCheck) {

			numberCheck = numberCheck(insert);

			if (numberCheck)
				result = Integer.parseInt(insert);
			else
				insert = sc.next();
		}

		return result;

	}

}
