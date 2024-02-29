package day37;

import org.testng.annotations.*;
public class Invocationcount {

	@Test(invocationCount=10)
	void Test() {
		System.out.println("This is testing....");
	}
	
}
