package com.nrk.java8;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class GroupByFunctions {

	public static void main(String arg[]) {
		
		Employee[] employee = {
				 new Employee("Ravi", "Nallamalli", 75000, "IT"),
		         new Employee("Gopi", "Anuku", 85000, "IT"),
		         new Employee("Susanth", "Kakarapathi", 96000.5, "Sales"),
		         new Employee("Hemanth", "Nunna", 75000, "Marketing"),
		         new Employee("Rajesh", "Puvvada", 85000, "IT"),
		         new Employee("Sri", "Gadhe", 100000, "Sales"),
		         new Employee("Subbarao", "Sabinani", 42361.4, "Marketing")
		};
		
		List<Employee> listEmployee = Arrays.asList(employee);
		
		//groupingByDepartment
		Map<String, List<Employee>>   groupdByDepartment  = listEmployee.stream().collect(Collectors.groupingBy(Employee :: getDepartment));
		//System.out.println(groupdByDepartment);

		//groupingBySalary
		Map<Double, List<Employee>>  groupBySalary   = listEmployee.stream().collect(Collectors.groupingBy(Employee :: getSalary));
		//System.out.println(groupBySalary);	
		
		
        List<Item> items = Arrays.asList(
                new Item("apple", 10, new BigDecimal("9.99")),
                new Item("banana", 20, new BigDecimal("19.99")),
                new Item("orang", 10, new BigDecimal("29.99")),
                new Item("watermelon", 10, new BigDecimal("29.99")),
                new Item("papaya", 20, new BigDecimal("9.99")),
                new Item("apple", 10, new BigDecimal("9.99")),
                new Item("banana", 10, new BigDecimal("19.99")),
                new Item("apple", 20, new BigDecimal("9.99"))
        );
		
		
        //groupByItemCount
        Map<String, Long> groupByCountItemName = items.stream().collect(Collectors.groupingBy(Item:: getName, Collectors.counting()));
        //System.out.println("groupdByCountItemName : " + groupByCountItemName);
        
        //groupByItemSum
        Map<String, Integer>  groupBySumItems  = items.stream().collect(Collectors.groupingBy(Item:: getName, Collectors.summingInt(Item :: getQty)));
       // System.out.println(groupBySumItems);
        
        //groupByPrice
        Map<BigDecimal, List<Item>>  groupByPriceItem = items.stream().collect(Collectors.groupingBy(Item :: getPrice));
        //System.out.println(groupByPriceItem);
        
    	// group by price, uses 'mapping' to convert List<Item> to Set<String>
        Map<BigDecimal, Set<String>>     groupByPricewithItemName =  items.stream().collect(Collectors.groupingBy(Item:: getPrice, Collectors.mapping(Item::getName, Collectors.toSet())));
        System.out.println(groupByPricewithItemName);
        	
	}
	
}
