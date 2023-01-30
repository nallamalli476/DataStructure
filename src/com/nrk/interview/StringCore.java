package com.nrk.interview;

public class StringCore {

	public static void main(String[] args) {
	
		String s = "Ravi";
		s.concat("kumar");
		s = s.concat(" Nallamalli");
        System.out.println(s);
        
        StringBuffer sb= new StringBuffer("Ravi");
        StringBuffer sb1 = new StringBuffer("Ravi");
        System.out.println(sb.equals(sb1));
        
	}
}
