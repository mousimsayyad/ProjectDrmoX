package day35.pack1;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class1 {

	@Test
	void abc()
	{
		System.out.println("This is abc from class 1");
	}
	@BeforeTest
	void m()
	{
		System.out.println("This is before test method...");
	}
	@BeforeSuite
	void bs() {
		System.out.println("this is Before suite method");
	}
	@AfterSuite
	void as() {
		System.out.println("this is after suite method");
	}
}
