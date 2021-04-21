package org.hcl;

import java.util.Scanner;

public class Tricky {
public static void main(String[] args) {
	String t="";
	System.out.println("Enter the String");
	Scanner sc=new Scanner(System.in);
	String str = sc.nextLine();
	String s = str.trim();
	for(int i=0;i<s.length();i++) {
		char ch = s.charAt(i);
		if(ch>=65 && ch<=91) {
			ch=(char) (ch+32);
			t=t+ch;
		}
		else {
			ch=(char)(ch-32);
			t=t+ch;
		}
	}
	
	System.out.println(t);
}
}
