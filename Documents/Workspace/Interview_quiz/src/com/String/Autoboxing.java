package com.String;

public class Autoboxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Boolean b=false;
		Boolean b1=false;
		
		System.out.println(b==b1);
		System.out.println(b.booleanValue()==b1.booleanValue());
		System.out.println(b.equals(b1));
		Boolean b3= new Boolean("False");
		System.out.println(b==b3);
		System.out.println(b.equals(b3));
		
		boolean a=false;
		boolean a1=false;
		System.out.println(a==a1);
		System.out.println(a==b);
		System.out.println(a==b3);

		Boolean t=new Boolean(false);
		Boolean t1=new Boolean(false);
		System.out.println(t==t1);
		System.out.println(t.equals(t1));
		boolean b11= new Boolean("false");
		boolean b12 = new Boolean("false");
		System.out.println(b12==b12);
		
		
	}

}
