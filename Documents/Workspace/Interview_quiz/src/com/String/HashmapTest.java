package com.String;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class HashmapTest {
	public static void main(String[] args) {
		Map<String , String> map= new HashMap<String, String>();
		System.out.println(map.size());
		System.out.println(map.size()==0);
		map.put("Dinesh", "Veer");
		
		System.out.println(map);
		
		System.out.println(map.size());
		

		Set<String> set= new TreeSet<>();
		//set.add("Dine");
		//set.add(null); //NullPointerException 
		System.out.println(set);
		
		Map<Employee1,String> empMap=new HashMap<>();
		Employee1 emp1=new Employee1(1, "Test");
		Employee1 emp2=new Employee1(1, "Test");
		empMap.put(emp1, "AA");
		empMap.put(emp2, "AA");
		System.out.println("Size " +empMap.size()+"  "+empMap);
		
	}
}

class Employee1{
	int id;
	String name;
	public Employee1(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
}
/*class A{
		
}

class B extends A{
	void method() {
		
	}
	
	public static void main(String[] args) {
		A a=new B();
		a.method();
	}
}*/