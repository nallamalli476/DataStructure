package com.nrk.interview;

import java.util.HashMap;
import java.util.Map;

public class CountRepeateCharacter {

	public static void main(String[] args) {
      
		String name = "NallamalliRavikumar";
		
		Map<Character, Integer> map = new HashMap<>();
		
		  for(int i=0; i<name.length(); i++) {
			  
			  char ch = name.charAt(i);
			  if(map.containsKey(ch)) {
				  int val = map.get(ch);
				      val = val+1;
				   map.put(ch, val);
			  }else {
				  map.put(ch, 1);
			  }
		}  
	    System.out.println(map);  
	}
}
