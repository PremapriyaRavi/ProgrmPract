package org.cts;

import java.util.Scanner;

public class FindAmstrongByTheRange {
	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			int a=i, r=0,sum=0;
			while(a!=0) {
				r=a%10;
				sum=sum+r*r*r;
				a=a/10;
			}
		
			if(i==sum) {
				System.out.println(i + "is Amstrong");
			}
		}
	}
}
