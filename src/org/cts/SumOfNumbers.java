package org.cts;

import java.util.Scanner;

public class SumOfNumbers {
	public static void main(String[] args) {
		int sum=0;
		System.out.println("Enter the size");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the elements to sum");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			sum=sum+a[i];
		}
		System.out.println("sum="+sum);
	}
}
