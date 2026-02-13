package com.arraytask;
import java.util.Scanner;
import java.util.Arrays;

public class SearchArray {
	
	

	public static void main(String[] args) {
		int arr[]=Arraystask.print();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter element to search:");
		int element=sc.nextInt();
		boolean found=false;
		
			int num=arr.length;
			for(int i=0;i<num;i++) {
	           if(arr[i]==element) {
					System.out.println("Element found at position: "+(i+1));
					found =true;
					break;
				}
			}
			if(!found) {
				System.out.println("element not found");
			}
//			System.out.println("Element found at position: "+ele);
		
		sc.close();
		
	

	}

}
