package com.study.programmers;

import java.util.Scanner;
import java.util.regex.Pattern;

import com.study.util.RuntimeCounter;

public class Summer2018_002 {
	static Scanner sc = new Scanner(System.in);

	static int[] A = {5,1,3,7};
	static int[] B = {2,2,6,8};
//	int[] A = {};
//	int[] B = {};

	public static void main(String[] args) {
//		int[] rankA = rank(A);
//		int[] rankB = rank(B);
		
//		view(rankA);
//		System.out.println();
//		view(rankB);
//		max(rankA, rankB);
		
		RuntimeCounter counter = new RuntimeCounter();
		counter.runStart();
		
		int n = (int) (2 * (Math.random()*5+10));
		A = new int[n/2];
		B = new int[n/2];
		setting();
		
		view(A);
		System.out.println();
		view(B);
		System.out.println();
		System.out.println("============================="+ A.length);
		int[] tempA = sort(A);
		int[] tempB = sort(B);
		
		view(tempA);
		System.out.println();
		view(tempB);
		System.out.println();
		System.out.println("=============================");
		System.out.println("=============================");
		System.out.println(countMax(tempA, tempB));
		counter.runend();
	}
	
	public static void setting(){
		
		for (int i = 0; i < A.length; i++) {
			A[i] = (int) (Math.random()*15+1);
			B[i] = (int) (Math.random()*15+1);
		}
		
	}
	
	public static void max(int[] rankA , int[] rankB){
		for (int i = 0; i < rankA.length; i++) {
			for (int j = 0; j < rankA.length; j++) {
				if (A[i]<B[j]) {
					/*if (A[i]<B[i] && B[i] > B[j]) {
					}else swap(B, i, j);
					*/
					if ((A[i]<B[i] && B[i] > B[j] )|| (A[i]>=B[i] && B[i] < B[j])) {
						swap(B, i, j);
					}
				}
			}
		}
	}
	
	public static int countMax(int[] a, int[] b){
		int count =0;
		int j = 0;
		for (int i = 0; i < b.length; i++) {
			if (a[i] < b[j]) {
				count ++;
				j++;
			}
		}
		
		return count;
	}
	
	public static int[] swap(int[] num , int i, int j){
		int temp = num[i];
		num[i] = num[j];
		num[j] = temp;
		return num;
	}
	
	public static int[] rank(int[] num){
        int[] temp = new int[num.length];
        for(int i=0; i<num.length; i++){
            for(int j=0; j<num.length; j++){
                if(i!=j && num[i]<num[j]){
                    temp[j]++;
                }
            }
        }
        return temp;
    }
	
	public static int[] sort(int[] num){
		for (int i = 0; i < num.length-1; i++) {
			for (int j = i; j < num.length; j++) {
				if (num[i]<num[j]) {
					swap(num, i, j);
				}
			}
		}
		return num;
	}
	
	public static void view(int[] num){
		for (int i = 0; i < num.length; i++) {
//			System.out.print(num[i] + " ");
			System.out.printf(" %3d ",num[i]);
			if (i!=0 && (i+1)%5==0 && (i+1) != num.length) {
//				System.out.println();
			}
		}
	}
	

}
