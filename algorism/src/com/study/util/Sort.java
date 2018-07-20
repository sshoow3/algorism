package com.study.util;

/**
 * 정렬 알고리즘 호출
 * 
 * @author netcomo
 * 
 *         버블 정렬(Bubble Sort)<br>
 *         선택 정렬(Selection sort)<br>
 *         삽입 정렬(Insertion sort)<br>
 *         합병 정렬(Merge sort)<br>
 *         힙 정렬(Heap sort)<br>
 *         퀵 정렬(Quick sort)<br>
 *         기수 정렬(Radix sort)<br>
 *         카운팅 정렬(Counting sort)<br>
 *         셸 정렬(Shell's sort)<br>
 *         보고 정렬(stupid sort)<br>
 *         보고보고 정렬(Bogobogo sort)<br>
 *         취침 정렬(Sleep sort)<br>
 */
public class Sort {
	public void Selection_ASC(int[] data) {
		// 선택정렬 오름차순
		for (int i = 0; i < data.length-1; i++) {
			int min = i;
			for (int j = i; j < data.length; j++) {
				if (data[min]>data[j]) min = j;
			}
			if (i!=min) swap(data, i, min);
		}
	}

	public void Selection_DESC(int[] data) {
		// 선택정렬 내림차순
		for (int i = 0; i < data.length-1; i++) {
			int max = i;
			for (int j = 0; j < data.length; j++) {
				if (data[max]<data[j]) max = j ;
			}
			if (max != i) swap(data, i, max);
		}
	}

	public void Bubble_ASC(int[] data) {
		// 버블정렬 오름차순
		for (int i = 0; i < data.length - 1; i++) {
			for (int j = i + 1; j < data.length; j++) {
				if (data[i] > data[j]) {
					swap(data, i, j);
				}
			}
		}
	}

	public void Bubble_DESC(int[] data) {
		// 버블정렬 내림차순
		for (int i = 0; i < data.length - 1; i++) {
			for (int j = i + 1; j < data.length; j++) {
				if (data[i] < data[j]) {
					int temp = data[i];
					data[i] = data[j];
					data[j] = temp;
					
				}
			}
		}
	}

	public void Insertion_ASC(int[] data) {
		// 삽입정렬 오름차순
		for (int i = 1; i < data.length; i++) {
			int standard = data[i];	//기준
			int aux = i-1;			//비교할 대상
			while (aux>= 0 && standard < data[aux]) {
				data[aux+1] = data[aux];
				aux--;
			}
			data[aux+1] = standard;
//			testView(data);
		}
	}

	public void Insertion_DESC(int[] data) {
		// 삽입정렬 내림차순
		for (int i = data.length-2; i >= 0; i--) {
			int standard = data[i];	//기준
			int aux = i+1;			//비교할 대상
			while (aux< data.length && standard < data[aux]) {
				data[aux-1] = data[aux];
				aux++;
			}
			data[aux-1] = standard;
//			testView(data);
		}
	}

	public void Merge_ASC(int[] data) {
		// 합병정렬 오름차순
		if (data.length == 1) return;
		
		int center = data.length/2;
		int left[] = new int[center];
		int right[] = new int[data.length-center];
		
		for (int i = 0; i < center; i++) {
			left[i] = data[i];
		}
		for (int i = 0; i < data.length-center; i++) {
			right[i] = data[center+i];
		}
		
		Merge_ASC(left);
		Merge_ASC(right);
		Merge_ASC_detail(data, left, right);
		
	}
	
	void Merge_ASC_detail(int[] data,int[] left ,int[] right) {
		// 합병정렬 오름차순
		int l = 0;
		int r = 0;
		int merge = 0;
		
		while (left.length != l && right.length != r) {
			if (left[l] < right[r]) {
				data[merge] = left[l];
				merge++;
				l++;
			}else {
				data[merge] = right[r];
				merge++;
				r++;
			}
		}
		
		while (left.length != l) {
			data[merge] = left[l];
			merge++;
			l++;
		}
		while (right.length != r) {
			data[merge] = right[r];
			merge++;
			r++;
		}
		
	}
	
	public void Merge_DESC(int[] data) {
		// 합병정렬 내림차순
		if (data.length == 1) return;
		
		int center = data.length/2;
		int left[] = new int[center];
		int right[] = new int[data.length-center];
		
		for (int i = 0; i < center; i++) {
			left[i] = data[i];
		}
		for (int i = 0; i < data.length-center; i++) {
			right[i] = data[center+i];
		}
		
		Merge_DESC(left);
		Merge_DESC(right);
		Merge_DESC_detail(data, left, right);
	}
	void Merge_DESC_detail(int[] data,int[] left ,int[] right){
		// 합병정렬 내림차순
		int l = 0;
		int r = 0;
		int merge = 0;
		while (left.length != l && right.length != r) {
			if (left[l] > right[r]) {
				
				data[merge] = left[l];
				merge++;
				l++;
			}else {
				data[merge] = right[r];
				merge++;
				r++;
			}
		}
		
		while (right.length != r) {
			data[merge] = right[r];
			merge++;
			r++;
		}
		while (left.length != l) {
			data[merge] = left[l];
			merge++;
			l++;
		}
		
	}

	public void Heap_ASC(int[] data) {
		// 힙 정렬(Heap) 오름차순
	}

	public void Heap_DESC(int[] data) {
		// 힙 정렬(Heap) 내림차순
	}

	public void Quick_ASC(int[] data) {
		// 퀵 정렬(Quick) 오름차순
		int start = 0;
		int end = data.length-1;
		asc_Quick_Sort(data, start, end);
	}
	
	void asc_Quick_Sort(int[] data, int left , int right){
		int pivot;
		int i;
		
		if (left<right) {
			pivot = asc_Pivot(data, left, right);
			asc_Quick_Sort(data,left,pivot-1);
			asc_Quick_Sort(data,pivot+1,right);
		}
	}
	int asc_Pivot(int[] data , int left, int right){
		int pivot = right;
		
		while (left < right) {
			while ((data[left]<=data[pivot])&&left<right) left++;
			while ((data[right]>=data[pivot])&&left>right) right--;
			if (left<right) {
				int temp = data[left];
				data[left] = data[right];
				data[right] = temp;
//				testView(data);
			}
		}
		
		return right;
	}

	public void Quick_DESC(int[] data) {
		// 퀵 정렬(Quick) 내림차순
		int start = 0;
		int end = data.length-1;
		desc_Quick_Sort(data, start, end);
	}
	

	void desc_Quick_Sort(int[] data , int left , int right){
		int pivot;
		int i;
		
		if (left<right) {
			pivot = desc_Pivot(data, left, right);
			desc_Quick_Sort(data,left,pivot-1);
			desc_Quick_Sort(data,pivot+1,right);
		}
	}
	
	int desc_Pivot(int[] data, int left , int right){
		int pivot = right;
		
		while (left < right) {
			while ((data[left]>=data[pivot])&&left<right) left++;
			while ((data[right]<=data[pivot])&&left>right) right--;
			if (left<right) {
				int temp = data[left];
				data[left] = data[right];
				data[right] = temp;
//				testView(data);
			}
		}
		
		return right;
	}

	public void Radix_ASC(int[] data) {
		// 기수 정렬(Radix) 오름차순
	}

	public void Radix_DESC(int[] data) {
		// 기수 정렬(Radix) 내림차순
	}

	public void Counting_ASC(int[] data) {
		// 카운팅 정렬(Counting) 오름차순
	}

	public void Counting_DESC(int[] data) {
		// 카운팅 정렬(Counting) 내림차순
	}

	public void Shell_ASC(int[] data) {
		// 셸 정렬(Shell's) 오름차순
	}

	public void Shell_DESC(int[] data) {
		// 셸 정렬(Shell's) 내림차순
	}

	public void stupid_ASC(int[] data) {
		// 보고 정렬(stupid) 오름차순
	}

	public void stupid_DESC(int[] data) {
		// 보고 정렬(stupid) 내림차순
	}

	public void Bogobogo_ASC(int[] data) {
		// 보고보고 정렬(Bogobogo) 오름차순
	}

	public void Bogobogo_DESC(int[] data) {
		// 보고보고 정렬(Bogobogo) 내림차순
	}

	public void Sleep_ASC(int[] data) {
		// 취침 정렬(Sleep) 오름차순
	}

	public void Sleep_DESC(int[] data) {
		// 취침 정렬(Sleep) 내림차순
	}
	
	int[] swap(int[] data , int i , int j){
		int temp = data[j];
		data[j] = data[i];
		data[i] = temp;
		return data;
	}
	
	void testView(int[] data){
		System.out.println("=========test=========");
		for (int i = 0; i < data.length; i++) {
			System.out.printf("| %3d |" , data[i]);
		}
		System.out.println("\n=========test=========");
	}

}
