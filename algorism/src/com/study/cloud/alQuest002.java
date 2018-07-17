package com.study.cloud;

import java.util.Scanner;
import java.util.regex.Pattern;

public class alQuest002 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int n = 0;
		int m = 0;

		do {
			n = whileNumberInserting(sc.next());
		} while (n < 1 || n > 10000);
		do {
			m = whileNumberInserting(sc.next());
		} while (m < 1 || m > 10000);
		view(n,m);

	}
	
	public static void view(int n , int m){
		int count = 0;
		String result = "";
		for (int i = n; i <=m; i++) {
			if(perfectCheck(i)) {
				if (count ==0) 
					result += i;
				else 
					result += " "+i;
				count++;
			}
		}
		
		if (count ==0)	System.out.println("No Answer!");
		else System.out.println(result);
		
	}
	public static boolean perfectCheck(int n ){
		int sum = 0;
		for (int i = 1; i < n; i++) {
			if (n%i == 0) sum += i;
		}
		if (sum == n) return true;
		else return false;
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
