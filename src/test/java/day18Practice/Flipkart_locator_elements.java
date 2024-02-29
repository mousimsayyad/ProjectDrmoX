package day18Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_locator_elements {

	public static void main(String[] args) {
		
		//1.open url
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		List<WebElement> elements =driver.findElements(By.className("_3n8fnaug _3n8fnamv _3n8fnaf9 _3n8fna1 _3n8fna7n _1i2djtb9 _9nihix1c"));
		System.out.println(elements.size());
		
		List<WebElement> images=driver.findElements(By.tagName("img"));
		System.out.println(images.size());

	}

}
