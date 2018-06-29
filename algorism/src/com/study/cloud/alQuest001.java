package com.study.cloud;

import java.util.Scanner;
import java.util.regex.Pattern;

public class alQuest001 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int n = 0;
		String m = "";
		int numM = 0;
		do {
			n = whileNumberInserting(sc.next());
		} while (n < 1 || n > 20);
		do {
			m = sc.next();
			if (numberCheck(m)) numM = Integer.parseInt(m); 
		} while (numM < 1 || numM > 99999999);
		view(n,numM);

	}

	public static void view(int n, int m) {
		int length = (int)(Math.log10(m)+1);
//		System.out.println(m+"length" + length);
		int[] number = new int[length];
		int a = 0;
		for (int i = length; i > 0; i--) {
//			System.out.println((int)(Math.pow(10, i-1)));
			number[a++] = m/(int)(Math.pow(10, i-1));
			m =  m%(int)(Math.pow(10, i-1));
		}
		ledView(number,n);
	}
	static boolean[][] board = { { true, true, true, false, true, true, true }, { false, false, true, false, false, true, false },
		{ true, false, true, true, true, false, true }, { true, false, true, true, false, true, true },
		{ false, true, true, true, false, true, false }, { true, true, false, true, false, true, true },
		{ false, true, false, true, true, true, true }, { true, false, true, false, false, true, false },
		{ true, true, true, true, true, true, true }, { true, true, true, true, false, true, false } };
	public static void ledView(int[] number , int m){
/*		int[][] board = { { 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 1, 0, 0, 1, 0 },
				{ 1, 0, 1, 1, 1, 0, 1 }, { 1, 0, 1, 1, 0, 1, 1 },
				{ 0, 1, 1, 1, 0, 1, 0 }, { 1, 1, 0, 1, 0, 1, 1 },
				{ 0, 1, 0, 1, 1, 1, 1 }, { 1, 0, 1, 0, 0, 1, 0 },
				{ 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 0, 1, 0 } };*/
		
//		x y y x y y x
		
		System.out.println("number.length" + number.length);
		
		
		for (int i = 0; i < board[0].length; i++) {
			if (i%3 == 0) {
				xview(number, i, m);
			}else {
				yview(number, i, m);
				i += 1;
			}
		}
		
	}
	
	public static void xview(int num , int line ,int m){
		if (board[num][line]) 
			{System.out.print(" ");for (int k = 0; k < m; k++) {System.out.print("-");}System.out.print(" ");}
		else
			{System.out.print(" ");for (int k = 0; k < m; k++) {System.out.print(" ");}System.out.print(" ");}
	}
	
	public static void yview(int num, int line ,int m){
		if (board[num][line])System.out.print("|");
		else System.out.print(" ");
		for (int k = 0; k < m; k++) {System.out.print(" ");}
		if (board[num][line+1])System.out.print("|");
		else System.out.print(" ");
		
	}
	public static void xview(int[] num , int line ,int m){
		for (int i = 0; i < num.length; i++) {
			if (board[num[i]][line]) {
				System.out.print(" ");for (int k = 0; k < m; k++) {System.out.print("-");}System.out.print(" ");
			}else {
				System.out.print(" ");for (int k = 0; k < m; k++) {System.out.print(" ");}System.out.print(" ");
			}
			System.out.print(" ");
		}
		System.out.println();
	}
	public static void yview(int[] num, int line ,int m){
		for (int j = 0; j < m; j++) {
			for (int i = 0; i < num.length; i++) {
				if (board[num[i]][line])System.out.print("|");
				else System.out.print(" ");
				for (int k = 0; k < m; k++) {System.out.print(" ");}
				if (board[num[i]][line+1])System.out.print("|");
				else System.out.print(" ");
				
				System.out.print(" ");
			}
			System.out.println();
		}
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
