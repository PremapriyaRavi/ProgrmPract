package org.cts;

import java.util.Scanner;

public class ReverseOfNumber {
	public static void main(String[] args) {
		System.out.println("Enter the number you want to reverse");
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		int sum=0,m=n;
	    while(n!=0) {
	    	int r=n%10;
	    	 sum=sum*10+r;
	    	 n=n/10;
	        }
		System.out.println("Reverse of"+m+"is"+sum);
	}
}
