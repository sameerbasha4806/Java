package com.arraytask;
import java.util.Scanner;
import java.util.Arrays;

public class CopyArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elements: ");
		int n=sc.nextInt();
		int arr1[]=new int[n];
		int arr2[]=new int[n];
		System.out.println("Enter "+n+" Elements");
		for(int i=0;i<n;i++) {
			arr1[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			arr2[i] =arr1[i];
		}
		System.out.println("Elements copied to new array: ");
		for(int i=0;i<n;i++) {
			System.out.println(arr2[i]);
		}
		
		
		sc.close();
//		System.out.println(Arrays.toString(arr2));
	

	}

}
