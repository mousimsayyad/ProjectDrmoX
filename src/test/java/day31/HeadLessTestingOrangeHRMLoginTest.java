package day31;


import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class HeadLessTestingOrangeHRMLoginTest {

	public static void main(String[] args) throws InterruptedException 
	{
///////////////chrome browser
		/*
		//Approach 1 Headless mode
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless=new");
		
		WebDriver driver = new ChromeDriver(options);
		
	*/
		//////Edge Driver 
		EdgeOptions options = new EdgeOptions();
		options.addArguments("--headless=new");
		WebDriver driver = new EdgeDriver(options);
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		//Thread.sleep(7000);
		
		//6.Verify the titile of the webpage
		//Title Validation
		/*String act_title=driver.getTitle();
		String exp_title = "OrangeHRM";
		
		if(act_title.equals(exp_title)) 
		{
			System.out.println("Test Passed");
		}
		else 
		{
			System.out.println("Failed");
		}*/
		
		
		//Label Validation after successful login
		String act_label=null;
		try {
			act_label=driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[1]/div[1]/span/h6")).getText();
		}
		catch(NoSuchElementException e) {
			act_label="";
		}
		 String exp_label = "Dashboard";
		 if(act_label.equals(exp_label)) 
		 {
			 System.out.println("Passed");
		 }
		 else 
		 {
			 System.out.println("failed");
		 }
		 
		//7.close the browser 
		driver.quit();
	}

}
