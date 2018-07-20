package com.study.programmers;

import java.util.Scanner;
import java.util.regex.Pattern;

import com.study.util.Quick_Sort;
import com.study.util.RuntimeCounter;

public class Summer2018_003 {
	
	static int[] A = {5,1,3,7};
	public static void main(String[] args) {
		Quick_Sort quick = new Quick_Sort();
		int data[] = {66, 10, 1, 34, 5, -10};
		int n = (int)(Math.random()*1000000+1);
		System.out.println(n);
		data = new int[n];
		data = setting(data);
		RuntimeCounter run = new RuntimeCounter();
		run.runStart();
//		view(data);
		ascSort(data, 0, data.length-1);
		run.runend();
//		quick.asc_Quick_Sort(data, 0, data.length-1);
		System.out.println("=============================================================");
		run.runStart();
//		view(data);
		descSort(data, 0, data.length-1);
//		quick.desc_Quick_Sort(data, 0, data.length-1);
//		view(data);
		run.runend();
	}
	public static int[] setting(int[] data){
		
		for (int i = 0; i < data.length; i++) {
			data[i] = (int)(Math.random()*200000-1000);
		}
		
		return data;
	}
	
	public static void view(int[] data){
		for (int i = 0; i < data.length; i++) {
//			System.out.println("data["+i+"] :" + data[i]);
			System.out.printf("| data[%d] : %3d |" ,i,data[i]);
		}
		System.out.println("\n==================viewEnd==================");
	}
	
	public int[] intAsc(int[] d){
		for (int i = 0; i < d.length-1; i++) {
			for (int j = i+1; j < d.length; j++) {
				
			}
		}
		return d;
	}
	
	public int[] swap(int[] d , int min , int location){
		int temp = d[d.length];
		for (int i = location; i < d.length; i++) {
			d[i+1] = d[i];
		}
		d[min] = temp;
		
		return d;
	}
	static int  ascCount = 0 ;
	public static void ascSort(int[] data, int l , int r){
		ascCount++;
		int left = l;
		int right =r;
//		System.out.println(ascCount +" 번째 연산 - asc left:" +l +" ,right :" +r);
		int pivot = data[(l+r)/2];
		do {
			while(data[left]<pivot) left++;
			while(data[right]>pivot) right--;
			if (left <= right) {
				int temp = data[left];
				data[left] = data[right];
				data[right] = temp;
				left++;
				right--;
			}
		} while (left <= right);
//		view(data);
		if (l < right) ascSort(data,l , right);
		if (r > left) ascSort(data, left, r);
	}
	static int descCount = 0 ;
	public static void descSort(int[] data , int l , int r){
		descCount++;
//		배열 시작
		int left = l;
//		배열 끝
		int right =r;
//		비교할 중간 값
//		System.out.println(descCount +" 번째 연산 - desc left:" +l +" ,right :" +r);
		int pivot = data[(l+r)/2];
		do {
			while(data[left]>pivot) left++;
			while(data[right]<pivot) right--;
			if (left <= right) {
				int temp = data[left];
				data[left] = data[right];
				data[right] = temp;
				left++;
				right--;
			}
		} while (left <= right);
//		view(data);
		if (l < right) descSort(data,l , right);
		if (r > left) descSort(data, left, r);
	}

}
