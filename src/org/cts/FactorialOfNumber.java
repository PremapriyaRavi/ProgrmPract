package org.cts;

import java.util.Scanner;

public class FactorialOfNumber {
	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		long fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("factorial of" + n +"is"+fact);
	}

}
