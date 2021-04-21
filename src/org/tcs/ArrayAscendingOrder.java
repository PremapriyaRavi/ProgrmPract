package org.tcs;

import java.util.Scanner;

public class ArrayAscendingOrder {
	public static void main(String[] args) {
		System.out.println("Enter the size of an array");
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the elements for an array");
		for(int i=0;i<n;i++) {
			 a[i] = sc.nextInt();
		}
		for(int i=0;i<n-1;i++)
			for(int j=i+1;j<n;j++) {
				if(a[i]>a[j]) {
					int c= a[i];
					a[i]=a[j];
					a[j]=c;
				}
			}
		System.out.println("Array after arraning");
		for(int i=0;i<n;i++)
			System.out.println(a[i]);
	}
}
