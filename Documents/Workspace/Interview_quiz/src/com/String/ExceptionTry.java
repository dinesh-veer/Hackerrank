package com.String;

public class ExceptionTry {
public static void main(String[] args) {
	try {
		throw new ArrayIndexOutOfBoundsException();
	}catch(ArrayIndexOutOfBoundsException ex) {
		throw new NullPointerException();
	}finally {
		System.out.println("finally");
		throw new ArrayIndexOutOfBoundsException();
	}
}
}
