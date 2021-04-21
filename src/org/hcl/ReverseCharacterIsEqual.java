package org.hcl;

import java.util.Scanner;

public class ReverseCharacterIsEqual {
	public static void main(String[] args) {
		String rev="";
		System.out.println("Enter the string");
		Scanner sc=new Scanner(System.in);
		String s = sc.nextLine();
		for(int i=s.length()-1;i>=0;i--) {
			char c = s.charAt(i);
			rev=rev+c;			
	}
	//System.out.println(rev);	
		if(rev.equals(s))
			System.out.println(rev +":String is equal");
		else
			System.out.println(rev +":String is not equal");
}
}