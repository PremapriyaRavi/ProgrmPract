package org.hcl;

public class StringCharacterCount {
	public static void main(String[] args) {
		String s="Hello this is Java mock By 2.30 PM";
		int c1=0,c2=0,c3=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>='a' && s.charAt(i)<='z')
				c1++;
			else if(s.charAt(i)>='A' && s.charAt(i)<='Z')
				c2++;
			else 
				c3++;
		}
		System.out.println("UpperCase");
	}

}
