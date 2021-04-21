package org.hcl;

import java.util.Scanner;

public class StringPalindrome {
	public static void main(String[] args) {
		String rev="";
		System.out.println("Enter the string");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		for(int i=s.length()-1;i>=0;i--){
			char ch = s.charAt(i);
			rev=rev+ch;
		}
		if(s.equals(rev))
			System.out.println(rev+":is Palindrome");
		else
			System.out.println(rev+":is not Palindrome");
		
	}

}
