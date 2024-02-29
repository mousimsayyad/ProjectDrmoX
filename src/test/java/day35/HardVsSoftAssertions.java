package day35;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardVsSoftAssertions {
	
	//@Test
	void mymethod() {
		
		System.out.println("Testing.....");
		System.out.println("Testing.....");
		System.out.println("Testing.....");
		System.out.println("Testing.....");
		Assert.assertEquals(1,2);
		System.out.println("this is hard Assert checking");
	}
	
	@Test
	void mymethod2() {
		System.out.println("Testing.....");
		System.out.println("Testing.....");
		System.out.println("Testing.....");
		System.out.println("Testing.....");
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(1, 2);
		System.out.println("this is soft Assert chekcing");
		sa.assertEquals(1, 1);
		
		sa.assertAll();
	}
	
}
