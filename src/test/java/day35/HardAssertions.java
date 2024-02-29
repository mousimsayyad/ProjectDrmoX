package day35;

import org.testng.Assert;
import org.testng.annotations.*;

public class HardAssertions {

	@Test
	void test() {
		//int x=10;
		//int  y=15;
		/*
		if(x==y) {
			System.out.println("test passed");
		}
		else {
			System.out.println("test failed");
		}*/
		
		//Assert.assertEquals(x, y);
		
		//Assert.assertTrue(true);  //pass
		//Assert.assertTrue(false); //pass
		
		int a=20;
		int b=10;
		
		//assert.assertEquals(actual, expected, description);
		//Assert.assertEquals(a>b, true, "a is not greater than b");
		
		String s1="abc";
		String s2="abc1";
		//Assert.assertEquals(s1, s2, "s1 and s2 are not equal");
		
		//Assert.assertNotEquals(s1, s2);
		
		
		if(false) {
			Assert.assertTrue(true);
			
		}
		else {
			//Assert.assertTrue(false);
			Assert.fail();
		}
		
	}
}
