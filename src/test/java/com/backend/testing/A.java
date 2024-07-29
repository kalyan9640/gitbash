package com.backend.testing;

import org.testng.annotations.Test;

public class A {
	
	public static int a=50;

	@Test
	public static void given() {
		System.out.println("execute given method");
	}
	
	@Test
	public static  void when() {
		System.out.println("execute when method");
	}
	@Test
	public  static void then() {
		System.out.println("execute then method");
	}
	
	
}
