
package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
public class Testcase1 {

	@BeforeTest
	public void BeforeTest() {
		
		System.out.println("inside BeforeTest");
	}

	
	@BeforeMethod
	public void setup() {
		
		System.out.println("inside setup");
	}

	
	@Test(description="type something" )
	public void HomeLoanTest() {
		
		System.out.println("inside HomeLoanTest");

	}
	
	@Test(enabled=false)
	public void CarLoanTest() {
		
		System.out.println("CarLoanTest");

	}
	
	@AfterMethod
	public void teardown() {
		
		System.out.println("inside teardown");
	}

}

