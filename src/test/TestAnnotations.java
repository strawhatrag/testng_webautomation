package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestAnnotations {
	
	@Test
	public void Test1() {
		System.out.println("Test1 Executed");
	}
	@Test
	public void Test2() {
		System.out.println("Test2 Executed");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("BeforeTest Executed");
	}
	@AfterTest
	public void AfterTest() {
		System.out.println("AfterTest Executed");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("BeforeMethod Executed");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("AfterMethod Executed");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("BeforeClass Executed");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("AfterClass Executed");
	}
	
}
