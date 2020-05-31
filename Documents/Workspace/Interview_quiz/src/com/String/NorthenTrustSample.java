/* IMPORTANT: Multiple classes and nested static classes are supported */
package com.String;
/*
 * uncomment this if you want to read input.*/
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class NorthenTrustSample {
   // public static void main(String args[] ) throws Exception {

    public static void main(String args[] ) throws IOException  { 
	/* Sample code to perform I/O:
         * Use either of these methods for input*/

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String testCases = br.readLine();                // Reading input from STDIN
       // System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        //System.out.println("Hi, " + name1 + ".");    // Writing output to STDOUT
        String[] values=name.split(" ");
        
        for(String str:values) {
        	Integer i=Integer.valueOf(str);
        	for(int j=1;j<=i;j++) {
        		if(j%15==0)
        			System.out.println("FizzBuzz");
        		else if(j%3==0)
        			System.out.println("Fizz");
        		else if(j%5==0)
        			System.out.println("Buzz");
        		else
        			System.out.println(j);
        	}
        	
        }

        // Write your code here

    }
}
