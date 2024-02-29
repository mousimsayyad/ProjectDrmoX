package day17Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentTest {

	public static void main(String[] args) {
		
		//1. Launch Browser
		WebDriver driver = new ChromeDriver();
		
		//2.open url
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		
		//3.provide username
		driver.findElement(By.name("Email")).clear();
		driver.findElement(By.name("Email")).sendKeys("admin@yourstore.com");
		
		//4.Provide password
		driver.findElement(By.id("Password")).clear();
		driver.findElement(By.id("Password")).sendKeys("admin");
		
		//5. Click on Login Button
		driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button")).click();
		
		//6.verify the title of daashboard page
		String act_title = driver.getTitle();
		String exp_title="Dashboard / nopCommerce administration";
		if(act_title.equals(exp_title)) {
			System.out.println("Test Passed");
		}
		else {
			System.out.println("Failed");
		}
		
		//7.dashboard title validation
		String act_title1 =driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/h1")).getText();
		String exp_title1="Dashboard";
		if(act_title1.equals(exp_title1)) {
			System.out.println("Test passed");
		}
		else {
			System.out.println("Failed");
		}
	}

}
