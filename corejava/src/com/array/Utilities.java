package com.array;

import java.util.Arrays;
import java.util.Scanner;

public interface Utilities {
	public static int[] getarray() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size=sc.nextInt();
		if(size<=0) {
			return null;
		}else {
			int [] arr=new int[size];
			for(int i=0;i<size;i++) {
				System.out.println("Enter "+i+" index value: ");			
				arr[i]=sc.nextInt();
				
			}
			return arr;
//			sc.close();
//			System.out.println(Arrays.toString(arr));
		}
	
	}
	
}	