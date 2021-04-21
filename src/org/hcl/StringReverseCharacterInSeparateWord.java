package org.hcl;

import java.util.Scanner;

public class StringReverseCharacterInSeparateWord {
	public static void main(String[] args) {
		System.out.println("Enter the String");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
//		String s="Hello World";
		String[] s1=s.split(" ");
	    String rev="";
	    for(int i=0;i<s1.length;i++) {
	    	String st=s1[i];
	    	for(int j=st.length()-1;j>=0;j--) {
	    		char ch = st.charAt(j);
	    		rev=rev+ch;
	    	}
	    	rev=rev+" ";
	    }
	    System.out.println(rev);
	}
}


