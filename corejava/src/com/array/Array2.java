package com.array;
import java.util.Scanner;
import java.util.Arrays;

public class Array2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int size=Integer.parseInt(sc.nextLine());
		if(size<=0 || size>10) {
			System.out.println("Invalid "); 
			sc.close();
		} 
		else {
			String arr[]=new String[size];
			for(int i=0;i<size;i++) {
			System.out.println("Enter "+i+" index value: ");
			String element=sc.nextLine();
			arr[i]=element;
				}
			sc.close();
			System.out.println(Arrays.toString(arr));		
			
		}
		
		}

}	


