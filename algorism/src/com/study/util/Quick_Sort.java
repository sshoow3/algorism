package com.study.util;

public class Quick_Sort {
	
	public void asc_Quick_Sort(int[] data, int left , int right){
		int pivot;
		int i;
		
		if (left<right) {
			pivot = asc_Pivot(data, left, right);
			asc_Quick_Sort(data,left,pivot-1);
			asc_Quick_Sort(data,pivot+1,right);
		}
	}
	public int asc_Pivot(int[] data , int left, int right){
		int pivot = right;
		
		while (left < right) {
			while ((data[left]<=data[pivot])&&left<right) left++;
			while ((data[right]>=data[pivot])&&left>right) right--;
			if (left<right) {
				int temp = data[left];
				data[left] = data[right];
				data[right] = temp;
			}
		}
		
		return right;
	}
	
	public void desc_Quick_Sort(int[] data , int left , int right){
		int pivot;
		int i;
		
		if (left<right) {
			pivot = desc_Pivot(data, left, right);
			desc_Quick_Sort(data,left,pivot-1);
			desc_Quick_Sort(data,pivot+1,right);
		}
	}
	
	public int desc_Pivot(int[] data, int left , int right){
		int pivot = right;
		
		while (left < right) {
			while ((data[left]>=data[pivot])&&left<right) left++;
			while ((data[right]<=data[pivot])&&left>right) right--;
			if (left<right) {
				int temp = data[left];
				data[left] = data[right];
				data[right] = temp;
			}
		}
		
		return right;
	}
	

}
