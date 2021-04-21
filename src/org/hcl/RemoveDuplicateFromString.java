package org.hcl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateFromString {
	public static void main(String[] args) {
		List<String> li=new ArrayList();
		li.add("Prema");
		li.add("priya");
		li.add("sugu");
		li.add("shobi");
		li.add("anand");
		li.add("pinky");
		li.add("sugu");
		li.add("sugu");
		li.add("anand");
		li.add("priya");
		System.out.println(li);
		Set<String> s=new LinkedHashSet(li);
		System.out.println(s);
		for(String x:s) {
			System.out.print(x +":"+ Collections.frequency(li, x));
		}
	}

}
