package com.nrk.datastructure;

public class LinearSearch {
	
	public static void main(String arg[]) {
	
		int[] array = new int[] {10,40,20,30,70,90,100,150};
		
		int search=100;
		
		for(int i=0; i<array.length; i++) {
			
			  if(array[i] == search) {
				  
				    System.out.println(i);
	    	  }
		}
	}
}
