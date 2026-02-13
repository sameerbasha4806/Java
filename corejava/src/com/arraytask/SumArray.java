package com.arraytask;
import java.util.Scanner;
import java.util.Arrays;

public class SumArray {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of elements: ");
	int size=sc.nextInt();
	int arr[]=new int[size];
	System.out.println("Enter "+size+" Elements: ");
	int sum=0;
	for(int i=0;i<size;i++) {
		arr[i]=sc.nextInt();
		sum+=arr[i];
	}
	
	System.out.println("Sum of array elements: "+sum);
	sc.close();
   }
}