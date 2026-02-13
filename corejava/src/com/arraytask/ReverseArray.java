package com.arraytask;

public class ReverseArray {
	public static void printReverse(int arr[]) {
		int num=arr.length;
		for(int i=0; i<num/2;i++) {
			int temp=arr[i];
			arr[i]=arr[num-1-i];
			arr[num-1-i]=temp;
		}
		for(int ele:arr) {
			System.out.println(ele);
		}
	}

	public static void main(String[] args) {
		int[]arr=Arraystask.print();
		printReverse(arr);

	}

}
