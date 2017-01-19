package com.lwh.junit;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class JunitAnnotation {

	@BeforeClass
	public static void beforeClass(){
		System.out.println("This is before class");
	}
	@AfterClass
	public static void afterClass(){
		System.out.println("This is after class");
	}
	@Before
	public void before(){
		System.out.println("This is before");
	}
	@After
	public void after(){
		System.out.println("This is after");
	}
	@Test
	public void testCase1(){
		System.out.println("This is test case 1");
	}
	@Test
	public void testCase2(){
		System.out.println("This is test case 2");
	}
	@Ignore
	public void ignoreCase(){
		System.out.println("This is ignore case, you can't see me");
	}
}
