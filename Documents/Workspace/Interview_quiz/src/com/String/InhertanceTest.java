
package com.String;

class A{
	void method() {
		System.out.println("A");
	}
}

class B extends A{
	void method() {
		System.out.println("B");
	}
}

public class InhertanceTest extends B {
	
	void test() {
		super.method();
	}
	
	public static void main(String[] args) {
		new InhertanceTest().test();
	}
}


