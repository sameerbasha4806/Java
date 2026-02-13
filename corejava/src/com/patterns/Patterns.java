package com.patterns;
import java.util.Scanner;

public class Patterns {
	public static void square() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Square Pattern");
		System.out.println("Enter no.of rows");
		int n=sc.nextInt();
		for(int i=0;i<=n;i++) {
			String s="";
			for(int j=0;j<=n;j++) {
				s+="* ";
			}
			System.out.println(s);
		}
//		sc.close();
	}
	public static void rectangle() {
		Scanner sc2=new Scanner(System.in);
		System.out.println("Rectangle Pattern");
		System.out.println("Enter no.of rows ");
		int m=sc2.nextInt();
		for(int i=0;i<=m;i++) {
			String s="";
			for(int j=0;j<=m*2;j++) {
				s+="* ";
			}
			System.out.println(s);
		}
//		sc2.close();
	}
	public static void rightTriangle() {
		Scanner sc3=new Scanner(System.in);
		System.out.println("Rectangle Pattern");
		System.out.println("Enter no.of rows ");
		int p=sc3.nextInt();
		for(int i=0;i<=p;i++) {
			String s="";
			for(int j=0;j<=i;j++) {
				s+="* ";
			}
			System.out.println(s);
		}
		sc3.close();
	}

	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter no.of rows");
//		int n=sc.nextInt();
//		for(int i=0;i<=n;i++) {
//			String s="";
//			for(int j=0;j<=n;j++) {
//				s+="* ";
//			}
//			System.out.println(s);
//		}
//		sc.close();
				square();
				rectangle();
				rightTriangle();

	}

}
