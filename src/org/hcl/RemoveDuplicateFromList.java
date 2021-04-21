package org.hcl;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateFromList {
	public static void main(String[] args) {
		List li=new ArrayList();
		li.add("hello");
		li.add('c');
		li.add("10");
		li.add("10");
		li.add("10");
		li.add("10");
		li.add(678l);
		li.add(34.5f);
		li.add(34.5f);
		System.out.println(li);
		Set s=new LinkedHashSet();
		s.addAll(li);
		System.out.println(s);
		
	}

}
