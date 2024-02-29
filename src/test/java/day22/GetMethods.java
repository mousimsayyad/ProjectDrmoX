package day22;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		//get method
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		//System.out.println(driver.getWindowHandle());
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
		Set<String> windorids=driver.getWindowHandles();
		
		for(String winid:windorids) {
			
			System.out.println(winid);
		}

	}

}
