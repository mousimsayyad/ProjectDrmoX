package day17Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRMloginTest {

	public static void main(String[] args) throws InterruptedException {
		
		//1.Launch Browser
		//ChromeDriver driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver();
		
		
		//2. open url
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		Thread.sleep(7000);
		
		//3.Providing username
		driver.findElement(By.name("username")).sendKeys("Admin");
		
		//4.Provide Password
		driver.findElement(By.name("password")).sendKeys("admin");
		
		//5. click on login button
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		Thread.sleep(5000);
		//6. Title Validation
		/*String act_title=driver.getTitle();
		String exp_tilte="OrangeHRM";
		
		if(act_title.equals(exp_tilte)) {
			System.out.println("Test Passed");
		}
		else {
			System.out.println("Failed");
		}
 		*/
		
		//6.Title Dashboard validation
		String act_title="";
		try {
		act_title=driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[1]/div[1]/span/h6")).getText();
		}
		catch(NoSuchElementException e) {
		}
		String exp_title="Dashboard";
		if(act_title.equals(exp_title)) {
			System.out.println("Test Passed");
		}
		else {
			System.out.println("Failed");
		}
		
		//7. close browser
		driver.quit();
	}

}
