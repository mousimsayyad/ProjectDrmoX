package day36;

import org.testng.annotations.Test;

public class Grouping {
	
	@Test(priority=1, groups= {"sanity", "regression"})
	void loginByEmail()
	{
		System.out.println("this is login by email");
	}
	@Test(priority=2, groups= {"sanity"})
	void loginByFacebook() {
		System.out.println("this is login by facebook");
	}

	@Test(priority=3, groups= {"sanity"})
	void loginByTwitter() {
		System.out.println("this is login by twitter");
	}
	
	@Test(priority=4, groups= {"sanity", "regression"})
	void signupbyEmail() {
		System.out.println("this is sign by email");
	}
	@Test(priority=5, groups= {"regression"})
	void signupbyfacebook() {
		System.out.println("this is signup by facebook");
	}
	@Test(priority=6, groups= {"regression"})
	void signupbytwitter()
	{
		System.out.println("this is signup by twitter");
	}
	
	@Test(priority=7, groups= {"sanity", "regression"})
	void paymentindollar() {
		System.out.println("payment in dollar");
	}
	
	@Test(priority=8, groups= {"sanity"})
	void paymentinruppess() {
		System.out.println("payment in ruppess");
	}
	@Test(priority=9, groups= {"regression"})
	void paymentreturnbybank()
	{
		System.out.println("payment return by bank");
	}
}
