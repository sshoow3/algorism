package com.study.cloud;

import java.util.Scanner;

public class alQuest007 {

	static Scanner sc = new Scanner(System.in);
	static float km = 0;
	static float accel = 0;
	static int people = 0;
	static float speed[] ;
	static float firstTime = 0;
	static float total = 0;
	
	public static void main(String[] args) {
		/*
		 * 경기가 종료되는 시점 참가선수 N명의 총 주행거리의 합 출력
		 * 마지막 10% 남은시점에서 시속 5km 빠르게
		 * 입력 1 주행거리 2총 선수 3 각 선수 평균속도 
		 * ex
		 * 30
		 * 5
		 * 10 14 17 9 7
		 * 136
		 */
		
		// 거리
		km = sc.nextFloat();
//		System.out.println();
		accel = km/10;
		// 선수 수
		people = sc.nextInt();
//		System.out.println();
		speed = new float[people];
		
		//각 선수 속력
		for (int i = 0; i < people; i++) {
			speed[i] = sc.nextFloat();
			
		}
		float max = max();
		
		firstTime = (km-accel)/max + (accel/(max+5));
//		firstTime = km / max;
		
		for (int i = 0; i < people; i++) {
			run(speed[i]);
		}
		int result = (int) total;
//		total = (float)Math.floor(total);
//		System.out.printf("%.0f\n",total);
//		System.out.println(total);
		System.out.println(result);
	}
	
	public static float max(){
		float max[] = speed;
		for (int i = 0; i < speed.length-1; i++) {
			for (int j = i+1; j < max.length; j++) {
				if (speed[i]<speed[j]) {
					float temp = speed[i];
					speed[i] = speed[j];
					speed[j] = temp;
					
				}
			}
		}
		return max[2];
	}
	
	public static void run(float sp){
		float temp = km - accel;
		float time = temp/sp;
		if (temp/sp > firstTime) {
			total += sp * firstTime;
//			System.out.println(sp * firstTime);
		}else {
//			total += temp;
//			total += (sp+5) * (firstTime - time);
//			System.out.println(temp + (sp+5) * (firstTime - time));
			if (temp + (sp+5) * (firstTime - time) >= km) {
				total += km	;
			}else {
				total += temp;
				total += (sp+5) * (firstTime - time);
			}
		}
	}
	
	

}
