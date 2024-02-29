package day19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorsDemo {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//Tag,id and css combination
		//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("MacBook");
		//driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("MacBook");
		
		
		//tag and class
		//driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("iphone");
		//driver.findElement(By.cssSelector(".search-box-text")).sendKeys("iphone");
		
		
		//tag and attribute
		//driver.findElement(By.cssSelector("input[name='q']")).sendKeys("pc");
		//driver.findElement(By.cssSelector("[name='q']")).sendKeys("pc");
		
		//tag class and attribute
		driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("Macbook");
		
	}

}
