package com.nrk.datastructure;

public class SortingAlgorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       int[] array = new int[] {99, 55, 1, 17, 48, 200}; 
		
		for(int i=0; i<array.length; i++) {

		    for(int j=i+1; j<array.length; j++) {
		    
		    	if(array[i]>array[j]) {
		    		
		    		int temp = array[i];
		    		
		    		array[i] = array[j];
		    		
		    		array[j] = temp;
		    	}
		    }
		}

		for(int i =0; i<array.length; i++) {
			System.out.print(array[i]  +", ");
		}

	}

}
