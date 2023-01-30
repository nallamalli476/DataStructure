package com.nrk.interview;

import java.io.File;
import java.io.FileNotFoundException;

public class ExceptionHandler {

	
	public int getSumFromFile(int i) throws FileNotFoundException {
	
		try {
			 int val = i;
			 
			 File f = new File("D:\\test");
		}
		
	  catch(NumberFormatException e) {
			e.printStackTrace();
		}
		catch(Exception e) {
			e.getMessage();
		}
		 return i;
	}
}
