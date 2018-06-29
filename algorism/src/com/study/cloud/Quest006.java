package com.study.cloud;

import java.util.Scanner;

public class Quest006 {

	public static void main(String[] args) {
		String input = "";
		Scanner sc = new Scanner(System.in);

		input = sc.nextLine();
		view(input);
  }
	
	public static void view(String input){
		for(int i = 0; i <= input.length(); i++){
			System.out.println(input.substring(0, i));
		}
	}

}
