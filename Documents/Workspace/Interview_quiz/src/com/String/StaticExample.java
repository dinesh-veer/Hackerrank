package com.String;

import java.util.HashMap;
import java.util.Hashtable;

public class StaticExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> map=new HashMap<>();
		map.put(null, 11);
		map.put(null, 222);
		
		Hashtable<String, Integer> table=new Hashtable<>();
		//table.put(null, 11);
		System.out.println(table);
		System.out.println(map);
		System.out.println("Hello");
		
		String s1 = "abc";
		String s2 = "abc";
		System.out.println("s1 == s2 is:" + s1 == s2);

	}

}
