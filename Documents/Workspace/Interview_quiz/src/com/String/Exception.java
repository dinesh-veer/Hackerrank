package com.String;

import java.io.IOException;

public class Exception {

	public static void main(String[] args) {
		try {
			System.out.println("test");
		}catch(Throwable ex) {
			System.out.println("Happen");
		}
		/*catch(Exception e) {
			System.out.println("Test");
		}*/
	}
}
