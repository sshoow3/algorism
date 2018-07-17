package com.study.cloud;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Quest002 {

	public static void main(String[] args) {
		String input = "";
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = whileNumberInserting(input = sc.next());

		System.out.println(add(x, y));

	}

	public static int add(int x, int y) {
		return x + y;
	}

	public static boolean numberCheck(String num) {

		boolean check = Pattern.matches("^*[0-9]*$", num);
		if (!check)
			System.out.println("입력하신건 숫자가 아닙니다.");
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
