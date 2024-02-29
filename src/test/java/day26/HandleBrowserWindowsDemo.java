package day26;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class HandleBrowserWindowsDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
		
		
		//capture the browser window ids
		Set<String> windowIds=driver.getWindowHandles(); //stroed 2 window ids
		
		//Approach1
		/*
		List<String> windowidsList =new ArrayList(windowIds);  //converted set to list collection
		String parentwindowId=windowidsList.get(0);
		String childWindowId = windowidsList.get(1);
		
		//switch to child window
		driver.switchTo().window(childWindowId);
		driver.findElement(By.xpath("//div[@class='d-flex web-menu-btn']//li[1]//a[1]")).click();
		
		//switch to parent window
		driver.switchTo().window(parentwindowId);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		*/
		
		//Approach 2
		/*for(String wid:windowIds)
		{
			String title=driver.switchTo().window(wid).getTitle();
			if(title.equals("OrangeHRM HR Software | OrangeHRM")) {
				driver.findElement(By.xpath("//div[@class='d-flex web-menu-btn']//li[1]//a[1]")).click();
			}
		}*/
		
		
		//closing specific browser window based on choice
		//1-x, 2-y 3-z 4-a 5-b
		/*for(String wid:windowIds)
		{
			String title=driver.switchTo().window(wid).getTitle();
			if(title.equals("x")|| title.equals("b")) {
				driver.close();
			}
		}*/
		//OrangeHRM
		
		for(String wid:windowIds)
		{
			String title=driver.switchTo().window(wid).getTitle();
			if(title.equals("OrangeHRM")) {
				driver.close();
			}
		}
		
	}

}
