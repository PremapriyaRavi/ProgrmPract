package org.hcl;

import java.util.Scanner;

public class StringReverseCharacter {
	public static void main(String[] args) {
		System.out.println("Enter the string");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		
	 for(int j=s.length()-1;j>=0;j--) {
			char c = s.charAt(j);
			System.out.print(c);
	}
 }
}

//Enter the string
//How are You?
//?uoY era woH
