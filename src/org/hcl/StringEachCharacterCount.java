package org.hcl;


import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class StringEachCharacterCount {
	public static void main(String[] args) {
		System.out.println("Enter the String");
	    Scanner sc=new Scanner(System.in);
	    String s=sc.nextLine(); 
	    Map<Character,Integer> m=new LinkedHashMap();
	    for(int i=0;i<s.length();i++) {
	    	char c = s.charAt(i);
	    	if(m.containsKey(c)) {
	    		Integer inval = m.get(c);
	    		m.put(c,inval+1);
	    	}
	    	else
	    	{
	    		m.put(c,1);
	    	}
	    }
	    System.out.println(m);
	}
}
