package com.String;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {

		//without using inbuilt function
		String input= new Scanner(System.in). nextLine();
		System.out.println("\n Without inbuit funciton\n"+new StringBuilder(input).reverse().toString());
		//usgin inbuit function
		char[] charArray=input.toCharArray();
		System.out.println("Using inbuit function");
		for(int i=charArray.length-1;i>=0;i--)
			System.out.print(charArray[i]);
		//another way using StringBuilder
		System.out.println("\nAnother way");
		StringBuilder string=new StringBuilder();
		for(int i=charArray.length-1;i>=0;i--)
			string.append(charArray[i]);
		System.out.println(string);
		
		//Using ArrayList
		System.out.println("Using ArrayList");
		List<Character> list=new ArrayList<>();
		for(char c:charArray)
			list.add(c);
		Collections.reverse(list);
		for(char c:list)
		System.out.print(c);
		charReversalUsingArray(charArray);
		
	}

	private static void charReversalUsingArray(char[] charArray) {

		System.out.println("\nUsing temparray");
		int length=charArray.length, right =length-1;
	//	char[] temparray= new char[charArray.length];
		for(int left=0;left<right;left++,right--) {
			char temp=charArray[left];
			charArray[left]=charArray[right];
			charArray[right]=temp;
		}
		for(char val:charArray)
			System.out.print(val);
		}
		
		
	

}
