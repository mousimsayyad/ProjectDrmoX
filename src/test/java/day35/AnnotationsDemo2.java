package day35;

import org.testng.annotations.*;

public class AnnotationsDemo2 {
	@BeforeClass
	void login()
	{
		System.out.println("Login...");
	}
	
	@Test(priority=1)
	void search()
	{
		System.out.println("search test...");
	}
	
	@Test(priority=2)
	void advancedsearch()
	{
		System.out.println("advanced search...");
	}
	
	@AfterClass
	void logout()
	{
		System.out.println("Logout...");
	}
}
