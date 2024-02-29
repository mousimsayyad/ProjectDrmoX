package day35;

import org.testng.annotations.*;

public class AllAnnotations {
	@BeforeSuite
	void bs() {
		System.out.println("this is before suite method");
	}
	@AfterSuite
	void as() {
		System.out.println("this is after suite method");
	}
	
	
	@BeforeTest
	void bt() {
		System.out.println("this is before test");
	}
	@AfterTest
	void at() {
		System.out.println("this is after test");
	}

	
	
	@BeforeClass
	void bc() {
		System.out.println("this is before class");
	}
	@AfterClass
	void ac() {
		System.out.println("this is after class");
	}
	
	@BeforeMethod
	void bm() {
		System.out.println("this is before method");
	}
	@AfterMethod
	void am() {
		System.out.println("this is after method");
	}
	
	@Test
	void test1() {
		System.out.println("This is Test1 method");
	}
	@Test
	void test2()
	{
		System.out.println("This is test2 method");
	}

}
