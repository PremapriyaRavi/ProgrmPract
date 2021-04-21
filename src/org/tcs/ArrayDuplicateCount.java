package org.tcs;

import java.util.Scanner;

public class ArrayDuplicateCount {
	public static void main(String[] args) {
		int count=0;
		System.out.println("Enter the no of elements");
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]= sc.nextInt();
			//System.out.println(a[i]);
		}	
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(a[i]==a[j]){
				count++;	
				}	
		    }
			//System.out.println(a[i]=count);
	    }	
		System.out.println(count);
	}
}