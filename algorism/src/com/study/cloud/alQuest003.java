package com.study.cloud;

import java.util.Scanner;
import java.util.regex.Pattern;

public class alQuest003 {

	static Scanner sc = new Scanner(System.in);
	static int n = 0;
	static String[] m ;
	public static void main(String[] args) {

		n = 0;
		n = Integer.parseInt(sc.nextLine());
		m = new String[n];
		
		for (int i = 0; i < n; i++) {
			m[i] = sc.nextLine();
		}
		
		view(m);
	}
	
	public static void view(String[] t2){
		
		for (int i = 0; i < t2.length; i++) {
			System.out.println(check(t2[i]));
			if (check(t2[i])) System.out.println("YES");
			else  System.out.println("NO");
		}

	}
	
	public static boolean check(String temp){
		
		int length = temp.length();
		System.out.println(temp);
		for (int i = 0; i < length/2; i++) {
			temp = temp.replace("()", "");
//			System.out.println(temp + " : " + temp.length());
		}
		
		if (temp.equals("")&& temp.length() == 0) {return true;}
		else {return false;}
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
