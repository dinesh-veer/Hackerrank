package com.String;

import java.util.HashMap;
import java.util.Map;

class StackOverflowError {
	public static void main(String[] args) {
		Employee e1= new Employee("");
		e1.name="Dinesh";
		Employee e2=e1;
		e2.name="Veer";
		System.out.println(e1.name+" "+e2.name);
		
		Map<String, String> map= new HashMap<>();
		map.put("T", "A");
		map.put("T", "B");
		map.put("IN", "A");
		map.put(null, "A");
		System.out.println(map.size());
		
		Employee e5 = new Employee("Dinesh");
		Employee e3 = new Employee("Dinesh");
		Employee e4 = new Employee("test");
		Map<Employee, String> test= new HashMap<>();
		test.put(e3, "");
		test.put(e4, "");
		test.put(e5, "");
		System.out.println(map.size());
		
		
	}
}

class Employee{
	public String name;
	
	public Employee(String name) {
		this.name=name;
		
	}

	
	@Override
	public boolean equals(Object obj) {
	return ((Employee)obj).name==this.name;
			}
	
	
}
