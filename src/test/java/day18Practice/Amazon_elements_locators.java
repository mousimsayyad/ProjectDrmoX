package day18Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_elements_locators {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("T-Shirts");
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		//driver.findElement(By.linkText("Men 100% Cotton Polo Tshirt")).click();
		driver.findElement(By.partialLinkText("Men 100% Cotton")).click();
		
		

	}

}
