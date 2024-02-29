package day30;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class ScrollingPage {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
		driver.manage().window().maximize();
		
		JavascriptExecutor js= driver;
		
		//1.scroll down page by pixel
		//js.executeScript("window.scrollBy(0,3000)","");
		//System.out.println(js.executeScript("return window.pageYOffset", ""));
		
		//2.Approach 2 scroll down to the page till the element is present
		//WebElement flagInd=driver.findElement(By.xpath("//img[@alt='Flag of India']"));
		
		//js.executeScript("arguments[0].scrollIntoView();", flagInd);
		
		//System.out.println(js.executeScript("return window.pageYOffset", ""));
		
		//3.Scroolldown till end of the document
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		System.out.println(js.executeScript("return window.pageYOffset", ""));
		
		Thread.sleep(3000);
		
		//go back to intial position
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
	}

}
