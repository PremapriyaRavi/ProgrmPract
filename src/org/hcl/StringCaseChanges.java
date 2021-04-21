package org.hcl;

import java.util.Scanner;
public class StringCaseChanges {
	//int i=5;
	//float f=(float)i;
public static void main(String[] args) {
	System.out.println("Enter the String");
	Scanner sc=new Scanner(System.in);
	String s = sc.next();
	for(int i=0;i<s.length();i++) {
		char ch = s.charAt(i);
		if(ch>=65 && ch<+91) {
			ch=(char) (ch+32);
			System.out.print(ch);
		}
		else {
			ch=(char)(ch-32);
			System.out.print(ch);
		}
	}
	
}
		
}

