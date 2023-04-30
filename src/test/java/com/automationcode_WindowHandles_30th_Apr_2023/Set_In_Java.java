package com.automationcode_WindowHandles_30th_Apr_2023;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set_In_Java {
	//holds unique elements
	// no final size
	//no index
	//no order in set

	public static void main(String[] args) {
		
		Set<String> s = new HashSet<String>();
		
		System.out.println(s.size());
		s.add("ABC");
		s.add("DEF");
		s.add("GHI");
		s.add("ABC");
		
		System.out.println(s.size());
		
		Iterator<String> it = s.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
