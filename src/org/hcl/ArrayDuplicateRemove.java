package org.hcl;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ArrayDuplicateRemove {
	public static void main(String[] args) {
		List<Integer> li=new ArrayList(5);
		li.add(10);
		li.add(30);
		li.add(10);
		li.add(50);
		System.out.println(li);
		Set<Integer> s=new LinkedHashSet(li);
		System.out.println(s);
	}

}
