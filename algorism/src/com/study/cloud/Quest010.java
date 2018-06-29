package com.study.cloud;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Quest010 {
static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {

		int n = 0;
		
		do{
			 n =  whileNumberInserting(sc.next());
		} while(n%2 == 0);
		
		int[] arr= new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = whileNumberInserting(sc.next());
		}
		
		overSearch(arr);
  }
	
	public static void overSearch(int[] arr){
		boolean[] check = new boolean[arr.length];
		
		for(int i=0; i<arr.length; i++){
			check[i] = true;
		}
		
		for(int i=0; i<arr.length-1; i++){
			for(int j=i+1; j<arr.length; j++){
				if(arr[i] == arr[j]){ check[i] =false; check[j]=false; }
			}
		}
		for(int i=0; i<check.length; i++){
			if(check[i])System.out.println(arr[i]);
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
