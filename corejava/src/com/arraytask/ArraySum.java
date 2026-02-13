package com.arraytask;

public class ArraySum {
	public static int sumOf(int[] arr) {
		 int sum=0;
			for(int ele:arr) {
				sum+=ele;
			}
			return sum;
	}			
	public static void main(String[] args) {
		int arr[]=Arraystask.print();
		int result=sumOf(arr);
		System.out.println(result);

	}

}
