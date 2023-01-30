package com.nrk.interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CountStringUsingStream {

	public static void main(String[] args) {
		
		List<String> ls = new ArrayList<>();
		ls.add("John");
		ls.add("kat");
		ls.add("Sen");
		ls.add("Alwan");
		
		//count greater than 3
		long count = ls.stream().filter(s -> s.length() >3).count();
		System.out.println(count);
		
		//Count Sort List<String>
		Collections.sort(ls);
		System.out.println(ls);
		
		//sort List<String> using stream api.
		List<String> sortString  = ls.stream().sorted().collect(Collectors.toList());
	    System.out.println(sortString);
		
	}

}
