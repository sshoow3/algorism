package com.study.test;

import com.study.util.RuntimeCounter;
import com.study.util.Sort;

public class Test001 {
	static RuntimeCounter counter = new RuntimeCounter();
	static int[] temp;
	static int[] test;
	static String text ;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sort sort = new Sort();
		int n = (int)(Math.random()*10000+1);
//		n = 6;
		test = new int[n];
		for (int i = 0; i < test.length; i++) {
			test[i] = (int)(Math.random()*1000);
		}
		temp = test.clone();
		System.out.println("=============================["+n+"]===================================");
		if (temp.length<25) {
			view(test);
		}
		System.out.println("====================================================================");
//		=====================================================================
//		text = " buble asc";
//		start();
//		sort.Bubble_ASC(temp);
//		end();
//		text = " buble desc";
//		start();
//		sort.Bubble_DESC(temp);
//		end();
//		=====================================================================
//		=====================================================================
//		text = " insert asc";
//		start();
//		sort.Insertion_ASC(temp);
//		end();
//		text = " insert desc";
//		start();
//		sort.Insertion_DESC(temp);
//		end();
//		=====================================================================
//		text = " Merge_ASC";
//		start();
//		sort.Merge_ASC(temp);
//		end();
//		text = " Merge_DESC";
//		start();
//		sort.Merge_DESC(temp);
//		end();
//		=====================================================================
//		=====================================================================
		text = " Quick_ASC";
		start();
		sort.Quick_ASC(temp);
		end();
		text = " Quick_DESC";
		start();
		sort.Quick_DESC(temp);
		end();
//		=====================================================================
	}
	
	public static void start(){

		if (temp.length<25) {
			System.out.println("===============================================  START" );
			view(test);
		}
		System.out.println("=============================================== " +text);
		counter.runStart();
	}
	public static void end(){

		
		if (temp.length<25) {
			view(temp);
			System.out.println("===============================================  END" );
		}
		
		temp = test.clone();
		counter.runend();
		System.out.println("=============================================== " +text);
	}
	
	public static void view(int[] data){
		for (int i = 0; i < data.length; i++) {
			System.out.printf("| %3d |" , data[i]);
		}
		System.out.println();
	}

}
