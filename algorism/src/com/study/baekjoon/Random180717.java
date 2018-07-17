package com.study.baekjoon;

import java.util.Scanner;

public class Random180717 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* https://www.acmicpc.net/problem/15784
		 * 컴퓨터공학과 에릭남 김진서는 주변에 자기보다 잘생긴 사람이 보이면 화가난다.

			진서는 수업을 듣기위해 강의실에 앉아있다. 강의실에는 N행 N열로 의자가 놓여있다.
			
			N행 N열의 의자 모두 사람들이 앉아있고 사람들의 매력지수 X[i][j] 가 주어진다. 
			(1 ≤ i, j ≤ N) i행 j열의 매력지수는 X[i][j]이고, A 가 B 보다 매력지수가 더 높으면 A 가 더 잘생겼다고 할 수 있다.
			
			진서는 자기보다 잘생긴 사람이 있는지 탐색을 하는데, 이 때 자신과 같은 행인 의자에 앉아 있는 사람 또는 같은 열인 의자에 앉아 있는 사람만 볼 수 있다.
			
			진서가 앉아있는 의자의 행 a 와 열 b가 주어질 때,  진서가 볼 수 있는 사람 중 자신보다 잘생긴 사람이 있다면 ANGRY, 그렇지 않다면 HAPPY를 출력하시오.
			
			
			
			입력
			입력의 첫째 줄에 의자가 놓인 행과 열의 수 N(1 ≤ N ≤ 1000)이 주어지고 , 
			진서가 앉은 의자가 위치한 행 a, 열 b가 주어진다. 이후 두번째 줄부터 N+1 줄까지 강의실에 앉아있는 학생들의 매력지수 X[i][j](1 ≤ X ≤ 50000)가 주어진다. X[i][j] 는 i행 j열에 앉은 학생의 매력지수이다. 
			
			출력
			진서가 자기보다 잘생긴 사람을 본다면 ANGRY, 아니라면 HAPPY를 출력한다.
		 */
		Scanner sc = new Scanner(System.in);
//		N 1~1000
		int N = sc.nextInt();
//		a , b
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println();
		int[][] X = new int[N][N];
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
//				1~50000
				X[i][j] = sc.nextInt();
			}
			System.out.println();
		}
		boolean check = true;
		for (int i = 0; i < X.length; i++) {
			if (X[b-1][a-1] < X[b-1][i] ) {
				check = false;
				break;
			}
		}
		
		for (int i = 0; i < X.length; i++) {
			if (check) {
				if (X[b-1][a-1] < X[i][a-1] ) {
					check = false;
					break;
				}
			}else {
				break;
			}
		}
		
		if (check) {
			System.out.println("HAPPY");
		}else {
			System.out.println("ANGRY");
		}

	}

}
