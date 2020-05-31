package com.String;

import java.util.Scanner;

public class BinaryNumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Integer tests=sc.nextInt();
		for(int j=0;j<tests;j++) {
		Integer number=sc.nextInt();
		String str=Integer.toBinaryString(number);
		int count=0, result=0;
		
		for(int i=0;i<str.length();i++) {
			if('0'==str.charAt(i)) {
				count=0;
			}else {
				count++;
				result=Math.max(result, count);
			}
		}
		System.out.println(result);
		}
	}
}
