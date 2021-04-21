package org.hcl;

import java.util.Scanner;

public class StringReverseWord {
	public static void main(String[] args) {
		System.out.println("enter the string");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
	    String[] sa= s.split(" ");
//	    for(int i=0;i<sa.length;i++) {
//	    	System.out.println(sa[i]);
//	    }
	    for(int j=sa.length-1;j>=0;j--) {
	    	System.out.print(sa[j] +" ");
	}
	}
}
//enter the string
//Hello How are You?
//You? are How Hello 
