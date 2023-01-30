package com.nrk.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Comaprator {

	public static void main(String[] args) {
	
		List<Integer> list = new ArrayList<>();
		
		list.add(90);
		list.add(15);
		list.add(75);
		list.add(45);
		list.add(150);
		list.add(89);
		list.add(100);
	    Collections.sort(list);
	    System.out.println(list);

	    //assedning order
	    List<Integer> sortAssedning = list.stream().sorted().collect(Collectors.toList());
	    
	    //assending order
	    List<Integer> sortAssedning1223 = list.stream().sorted((i1,i2) -> i1.compareTo(i2)).collect(Collectors.toList());
	    System.out.println( "Assending order :" +sortAssedning1223);
	    
	    //desending order
	    List<Integer> sortedDessending = list.stream().sorted((i1,i2) -> (i1<i2)?1 : (i1>i2)?-1: 0).collect(Collectors.toList());
	    	    
	    System.out.println( "Desending order : "+sortedDessending);
	    
		
	}
}
