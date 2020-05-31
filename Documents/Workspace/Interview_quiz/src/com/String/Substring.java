package com.String;

import java.util.Scanner;

public class Substring {

	/*private static void printAllSubstrings(String inputString) {
		System.out.println("All possible substrings of " + inputString + " are : ");
		for (int i = 0; i < inputString.length(); i++) {
			for (int j = i + 1; j <= inputString.length(); j++) {
				System.out.println(inputString.substring(i, j));
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Input String : ");
		String inputString = sc.next();
		printAllSubstrings(inputString);
		sc.close();
	}*/
	private static void printAllSubstrings(String inputString) 
    {
        System.out.println("All possible substrings of "+inputString+" are : ");
        StringBuilder subSring;
        for (int i = 0; i < inputString.length(); i++) 
        {
            subSring = new StringBuilder().append(inputString.charAt(i));
            System.out.println(subSring);
            for (int j = i+1; j < inputString.length(); j++) 
            {
                subSring.append(inputString.charAt(j));
                System.out.println(subSring);
            }
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Input String : ");
        String inputString = sc.next();
        printAllSubstrings(inputString);
        sc.close();
    }
}
