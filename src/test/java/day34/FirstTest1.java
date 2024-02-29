package day34;

import org.testng.annotations.Test;

public class FirstTest1
{
	@Test(priority=1)
	void openapp()
	{
		System.out.println("Testing1");
	}
	
	@Test(priority=2)
	void login()
	{
		
		System.out.println("Testing2");
	}
	
	@Test(priority=3)
	void logout()
	{
		System.out.println("Testing3");
		
	}
 
}
