package com.arraytask;
import java.util.Scanner;
import java.util.Arrays;

public interface Arraystask {
	public static int[] print() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter "+n+" Elements: ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		return arr;
	}

}
