package com.nrk.interview;

import java.util.ArrayList;
import java.util.List;

public class Programmes {

	public static void main(String[] args) {
		
		List<String> al = new ArrayList<>();
		al.add("123_test.txt");
		al.add("234_file1.txt");

		for(String s : al) {
		 
			String[] s1 = s.split("_");
			
			for(String s2 : s1) {
				System.out.println(s2);
			}
			
		}
	}

}
