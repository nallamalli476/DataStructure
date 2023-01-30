package com.nrk.interview;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class GroupByFunctionMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Employee e1 = new Employee(1L, "Ravikumar", "Nallamalli", "IT", 50000.00);
		Employee e2 = new Employee(2L, "Mani", "Polisetty", "IT", 70000.00);
		Employee e3 = new Employee(3L, "Susanth", "Kakarapathi", "Markting", 80000.00);
		Employee e4 = new Employee(4L, "Gopi", "Anuku", "IT", 50000.00);
		Employee e5 = new Employee(5L, "Hemanth", "Nunna", "Markting", 90000.00);
		
		List<Employee> listEmployee = new ArrayList<>();
		listEmployee.add(e1);
		listEmployee.add(e2);
		listEmployee.add(e3);
		listEmployee.add(e4);
		listEmployee.add(e5);
		
		                   
		//Map<Long, Set<Double>>  maplist = listEmployee.stream().collect(Collectors.groupingBy(Employee :: getId, Collectors.mapping(Employee :: getSalary, Collectors.toSet())));
		
		//map employee id and employee objects
		Map<Long, List<Employee>>   mapEmployee = listEmployee.stream().collect(Collectors.groupingBy(Employee :: getId));
		
		//System.out.println(mapEmployee);
		//System.out.println(maplist);
		
		
				
	}

}
