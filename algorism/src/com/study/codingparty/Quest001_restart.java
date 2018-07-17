package com.study.codingparty;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Quest001_restart {
	 /*
	 * 배달의민족은 시범적으로 새로운 광고 상품을 만들기로 하였습니다. 시범 서비스이기 때문에, 일부분의 지역에서 3개의 업소를 대상으로만 진행해 볼 생각입니다.
	각 업소는 직사각형 모양의 광고 영역을 설정하고, 단위 영역 당 지불할 광고비를 책정하여 배달의민족에 제출합니다. 특정 지역은 2개 이상의 업소의 광고 영역에 포함될 수 있는데, 
	이 때는 가장 높은 광고비를 책정한 업소의 광고만 노출 됩니다. 광고비 정산은, 
	업소가 정한 단위 영역 당 광고비와 광고 노출 영역의 곱으로 이루어지기 때문에 각 업소의 광고 상품이 노출되는 면적을 알아내는 것이 필요합니다.
	3개 업소에서 단위 영역 당 지불하는 광고비의 오름차순으로 업소 번호를 부여했을 때, 1번 업소가 노출되는 영역의 면적은 얼마인지 구하는 프로그램을 작성하십시오.

	위에서 각 직사각형의 좌표가 다음과 같다고 하면
	1번 직사각형의 왼쪽 아래 좌표가 (700, 400), 오른쪽 위 좌표가 (1600, 1100)
	2번 직사각형의 왼쪽 아래 좌표가 (0, 400), 오른쪽 위 좌표가 (1100, 900)
	3번 직사각형의 왼쪽 아래 좌표가 (900, 0), 오른쪽 위 좌표가 (1800, 650)
	
	1번 직사각형과 2번 또는 3번이 겹치는 영역에서는 2번과 3번이 단위 영역 당 광고비를 더 많이 지불했음으로 1번 업소의 광고가 노출이 안 되게 됩니다. 
	위 그림에서 1번 업소가 노출되는 영역의 면적은, 점선 위 영역과(900 * 200 = 180,000) 점선 아래 영역을(500 * 250 = 125,000)을 합한 305,000이 됩니다.

	광고비 정산은, 업소가 정한 단위 영역 당 광고비와 광고 노출 영역의 곱으로 이루어지기 때문에 각 업소의 광고 상품이 노출되는 면적을 알아내는 것이 필요합니다.

	입력은 한 줄에 다음과 같이 12개의 정수가 공백으로 구분되어 주어집니다.
	x1  y1  x2  y2  x3  y3  x4  y4  x5  y5  x6  y6
	1번 업소 직사각형의 왼쪽 아래 꼭지점이 (x1,y1), 오른쪽 꼭지점이 (x2,y2)
	2번 업소 직사각형의 왼쪽 아래 꼭지점이 (x3,y3), 오른쪽 꼭지점이 (x4,y4)
	3번 업소 직사각형의 왼쪽 아래 꼭지점이 (x5,y5), 오른쪽 꼭지점이 (x6,y6)

	각 꼭지점의 x, y 값은 모두 1이상 10,000 이하이며, 표준 입력으로 12개의 정수가 주어졌을 때 1번 업소의 노출 영역의 면적을 출력하는 프로그램을 작성하십시오.
	*/
	// 700 400 1600 1100 0 400 1100 900 900 0 1800 650
	// 400 * 700        1100 * 500      900 * 650
	static int[][] company = new int[3][5];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] insert = new int[12];
		int count = 0 ;
		Scanner sc = new Scanner(System.in);

		while (count < 12) {
			System.out.print(" 입력 : ");
			String temp = sc.nextLine();
			temp = temp.trim();
			if (Checkking(temp)) {
				String[] temparr = temp.split(" ");
				for (int i = 0; i < temparr.length; i++) {
					if (NumberChecking(temparr[i])) {
						insert[count++] = Integer.parseInt(temparr[i]);
					} 
				}
			}else if (NumberChecking(temp)) {
				insert[count++] = Integer.parseInt(temp);
			} 
			
		}
		setting(insert);
		int[] company1 = {insert[0],insert[1],insert[2],insert[3]};
		int[] company2 = {insert[4],insert[5],insert[6],insert[7]};
		int[] company3 = {insert[8],insert[9],insert[10],insert[11]};
//		int [] company1 = {700 ,400 ,1600 ,1100};
//		int [] company2 = {0 ,400 ,1100 ,900};
//		System.out.println(rectangleArea(company1));
//		System.out.println(rectangleArea(company2));
		
		if (rectangleArea(company1) > rectangleArea(company2)) {
			int[] temp = company1;
			company1 = company2;
			company2 = temp;
			
		}
		if (rectangleArea(company1) > rectangleArea(company3)) {
			int[] temp = company1;
			company1 = company3;
			company3 = temp;
		}
		if (rectangleArea(company2) > rectangleArea(company3)) {
			int[] temp = company2;
			company2 = company3;
			company3 = temp;
		}
		
		overArea(company1, company2);
		
		
		/*
		 * a와 b 사각형중 ax1 <= (bx1 or bx2) <= ax2 && ay1 <= (by1 or by2) <= ay2
		 * >> ax1 <= bx1 <= ax2 || ax1 <= bx2 <= ax2
		 */
	
	}
	public static int rectangleArea(int[] location){
		int x = location[2] - location[0];
		int y = location[3] - location[1];
		int area = x * y;
		return area;
	}
	
	public static int[] overArea(int[] company1 , int[] company2){
		int [] over = new int[4];
//		겹치는 x축
		int overxCount = 0;
		int overyCount = 0;
		if (company1[0] <= company2[0]&& company1[2] >= company2[0]) {
			over[0]= company2[0];
			overxCount++;
		}else {
			over[0] = company1[0];
		}
		if (company1[0] <= company2[2]&& company1[2] >= company2[2]) {
			over[2] = company2[2];
			overxCount++;
		}else {
			over[2] = company1[2];
		}
//		겹치는 y축
		if (company1[1] <= company2[1]&& company1[3] >= company2[1]) {
			over[1] = company2[1];
			overyCount++;
		}else {
			over[1] = company1[1];
		}
		if (company1[1] <= company2[3]&& company1[3] >= company2[3]) {
			over[3] = company2[3];
			overyCount++;
		}else {
			over[3] = company1[3];
		}
		if ((overxCount * overyCount)>=1) {
//			System.out.println(rectangleArea(over));
			return over;
		}else {
			return new int[]{0,0,0,0};
		}
		
		
	}
	
	public static boolean NumberChecking(String temp){
		boolean check = false;

		check = Pattern.matches("^[0-9]*$", temp);
//		System.out.println(temp + "숫자"+check);
		return check;
	}
	
	public static boolean Checkking(String temp){
		boolean check = false;

		check = Pattern.matches("^[\\d]*+([\\s]+[\\d]*){0,11}$", temp);
//		System.out.println(temp + "공백"+check);

		return check;
	}
	public static int[] setting(int[] insert){
		// 입력된 숫자를 올바른 순서로 이동(낮은x, 낮은 y, 높은x, 높은y) 순으로 정렬
		for (int i = 0; i < 3; i++) {
			if (insert[(i*4)] > insert[(i*4)+2]) {
				int temp = 0;
				temp = insert[(i*4)];
				insert[(i*4)] = insert[(i*4)+2];
				insert[(i*4)+2] = temp;
//				System.out.println(insert[(i*4)] + " x:x " + insert[(i*4)+2]);
			}
			if (insert[(i*4)+1] > insert[(i*4)+3]) {
				int temp = 0;
				temp = insert[(i*4)+1];
				insert[(i*4)+1] = insert[(i*4)+3];
				insert[(i*4)+3] = temp;

//				System.out.println(insert[(i*4)+1] + " y:y " + insert[(i*4)+3]);
			}
			
		}
		return insert;
	}
	
}
