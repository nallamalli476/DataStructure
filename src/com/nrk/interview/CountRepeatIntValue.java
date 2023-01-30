package com.nrk.interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountRepeatIntValue {

	public static void main(String[] args) {
 
		List<Integer> ls = new ArrayList<>();
		ls.add(2);
		ls.add(3);
		ls.add(2);
		ls.add(3);
		ls.add(4);
		ls.add(1);
		ls.add(5);
		ls.add(1);
		
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int i=0; i<ls.size(); i++) {
			 
			int checkValue = ls.get(i);
            
			if(map.containsKey(checkValue)) {
				
				int val = map.get(checkValue);
			    int increament = val+1;
				map.put(val, increament);
			}else {
				int value  = ls.get(i);
				map.put(value, 1);
			}
		}
	    System.out.println(map);
	}

}
