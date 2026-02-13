package com.arraytask;

public class EvenOdd {
	public static void isevenOrodd(int[] arr) {
		for(int ele:arr) {
			if(ele<=0){
				System.out.println("invalid");
			}
			else if(ele%2==0) {
				System.out.println("even");
			}else {
				System.out.println("odd");
			}
			
		}
		
	}
	public static void main(String[] args) {
	int arr[]=Arraystask.print();
	isevenOrodd(arr);

	
	}

}
