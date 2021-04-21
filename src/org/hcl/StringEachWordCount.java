package org.hcl;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class StringEachWordCount {
	public static void main(String[] args) {
		System.out.println("Enter the string");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String[] s2=s.split(" ");
		Map<String,Integer>m=new LinkedHashMap();
		for(int i=0;i<s2.length;i++) {
			if(m.containsKey(s2[i])) {
				Integer inval = m.get(s2[i]);
				m.put(s2[i],inval+1);
			}
			else {
			m.put(s2[i],1);	
			}
		}
		System.out.println(m);
	}
}
