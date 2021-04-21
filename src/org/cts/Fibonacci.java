package org.cts;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		System.out.println("Enter the value of n");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=-1,b=1;
		for(int i=0;i<=10;i++) {
			int c=a+b;
			System.out.print(c +" ");
			a=b;
			b=c;
		}
	}

}
