package com.study.util;
/**
 * 알고리즘 제작시 자주 쓰이는 메소드
 * @author netcomo
 *
 */
public class AlgorismUtill {
	
	/**
	 * int[] view - 5개 출력 후 개형
	 * @param intArr int[]
	 * @version 0.1
	 * @see <pre>
	 * 2018.06.27 kim jinho
	 */
	public void intArrayView(int[] intArr){
		for (int i = 0; i < intArr.length; i++) {
			System.out.printf(" [%d] ",intArr[i]);
			if ( i != 0 && (i+1) %5 ==0 && (i+1) != intArr.length) {
				System.out.println();
			}
		}
		System.out.println();
	}
	/**
	 * int[] sort - 정렬<br>
	 * order 0> 오름차순 0< 내림차순
	 * @param intArr int[]
	 * @param order int
	 * @return int[]
	 */
	public int[] intArraySort(int[] intArr , int order){
		for (int i = 0; i < intArr.length; i++) {
			for (int j = i+1; j < intArr.length; j++) {
				if (order>0 && intArr[i] < intArr[j]) intArraySwarp(intArr, i, j);
				else if (order<0  && intArr[i] > intArr[j]) intArraySwarp(intArr, i, j);
			}
		}
		return intArr;
	}
	/**
	 * int[] swarp - 데이터 교환<br>
	 * i와 j 데이터 교환
	 * @param intArr int[]
	 * @param i int
	 * @param j int
	 * @return int[]
	 */
	public int[] intArraySwarp(int[] intArr , int i , int j){
		int temp = intArr[i];
		intArr[i] = intArr[j];
		intArr[j] = temp;
		return intArr;
	}
	
	public int[] intArraySetting(int[] intArr){
		
		for (int i = 0; i < intArr.length; i++) {
			intArr[i] = 0;
		}
		
		return intArr;
	}
	
	public String[] stringSetting(String[] StringArr){
		
		for (int i = 0; i < StringArr.length; i++) {
			StringArr[i] = "";
		}
		
		return StringArr;
	}
	
}
