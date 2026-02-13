package com.array;

public class PalindromeArray {
	
	public static boolean isPalindrome(int num) {
		int temp=num;
		int rev=0;
		while(num!=0) {
			int remainder=num%10;
			rev=rev*10+remainder;
			num/=10;
		}
		return rev==temp;
		
	}

	public static void main(String[] args) {
	     int []arr=Utilities.getarray();
	     for(int ele:arr) {
	    	 if(isPalindrome(ele)) {
	    		 System.out.println(ele);
	    	 }
	     }

	}

}
