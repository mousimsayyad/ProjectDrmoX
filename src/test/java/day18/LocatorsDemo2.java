package day18;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo2 {

	public static void main(String[] args) {
		
		//WebDriverManager.chromeDriver.setup();
		WebDriver driver = new ChromeDriver();
		
		//open url
		driver.get("https://www.amazon.in/ref=nav_logo");
		driver.manage().window().maximize(); //maximize the window
		
		//finding no of sliders on home page
		List<WebElement> sliders=driver.findElements(By.className("a-link-normal"));
		System.out.println(sliders.size());
		
		//Find total number of images on home page
		List<WebElement> images=driver.findElements(By.tagName("img"));
		System.out.println(images.size());
		
		
		//Find total no of links
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("Total no of links "+links.size());
		
		
		driver.quit();
	}

}
