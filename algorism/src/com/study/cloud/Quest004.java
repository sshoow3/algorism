package com.study.cloud;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Quest004 {

	public static void main(String[] args) {
		String input = "";
		Scanner sc = new Scanner(System.in);

		int n = whileNumberInserting(input = sc.next());
		int[] arr = new int[n];
		for(int i=0; i < n; i++){
			arr[i] = whileNumberInserting(input = sc.next());
		};
		System.out.println(arrmin(arr));
  }
	
	public static int arrmin(int[] arr){
		int min =arr[0];
		for(int i=0; i < arr.length; i++){
			System.out.println(min + " : " + arr[i]+ " : " + (min > arr[i]));
			if(min > arr[i]) min = arr[i];
		};
		return min;
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
