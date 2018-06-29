package com.study.cloud;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Quest003 {

	public static void main(String[] args) {
		String input = "";
		Scanner sc = new Scanner(System.in);

		int num = whileNumberInserting(input = sc.next());
		System.out.println(absoluteValue(num));
  }
	
	public static int absoluteValue(int num){
		if(num < 0) num = -num;
		return num;
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
