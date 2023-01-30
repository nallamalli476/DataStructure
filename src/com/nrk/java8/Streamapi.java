package com.nrk.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Streamapi {

	public static void main(String[] args) {
	
      List<Integer> list = new ArrayList<>();
      List<Integer> newList = new ArrayList<>();
      
      list.add(75);
      list.add(60);
      list.add(90);
      list.add(4);
      list.add(18);
      list.add(39);
		
      System.out.println(list);

	  for (Integer i : list) {
			if (i % 2 == 0) {
				newList.add(i);
			}
		}
		List<Integer> streamList = list.stream().filter(i -> i%2==0).collect(Collectors.toList());
		List<Integer> marksList = list.stream().filter(i -> i>=60).collect(Collectors.toList());
		Long count = list.stream().filter(i-> i>=60).count();
		List<Integer> sorted = list.stream().sorted().collect(Collectors.toList());
		System.out.println(sorted);
	}

}
