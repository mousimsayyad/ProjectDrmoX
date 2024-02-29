package day18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo1 {

	public static void main(String[] args) {
		
		//WebDriverManager.chromeDriver.setup();
		WebDriver driver = new ChromeDriver();
		
		//open url
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize(); //maximize the window
		
		//search-box
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("T-shirts");
		
		//search-button
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		//link text & partial link text
		//driver.findElement(By.linkText("Men's Cotton Rich Solid Polo T-Shirt Regular Fit (Available in Plus Size)")).click();
		driver.findElement(By.partialLinkText("Men's Cotton Rich")).click();
		
	}

}
