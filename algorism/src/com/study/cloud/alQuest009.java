package com.study.cloud;

import java.util.Scanner;
import java.util.regex.Pattern;

public class alQuest009 {

	static Scanner sc = new Scanner(System.in);
	static String [][] board ;
	static boolean [][] mvboard;
	
	public static void main(String[] args) {
		/*
		 * R 행 C 열 입력 지도 크기
		 * . 비어있는곳
		 * * 물이 차있는지역 
		 * X 돌
		 * D 비버 굴
		 * S 고슴도치 위치
		 */
//		R
		int r = sc.nextInt();
		int c = sc.nextInt();
		board = new String[c][r];
		mvboard = new boolean[c][r];
		
		for (int i = 0; i < c; i++) {
			for (int j = 0; j < r; j++) {
				board[c][r] = sc.next();
				if (board[c][r].equals("*")) {
					mvboard[c][r] = false;
				}else {
					mvboard[c][r] = true;
				}
			}
		}
		
		
		
		
		
	}

}
