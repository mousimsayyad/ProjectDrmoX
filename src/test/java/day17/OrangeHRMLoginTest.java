package day17;


import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMLoginTest {

	public static void main(String[] args) throws InterruptedException 
	{
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
		
		//1.Launch Browser
		//ChromeDriver driver = new ChromeDriver();
		WebDriver driver= new ChromeDriver();
		
		//2.Open url on the browser
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().window().maximize(); //maximize the page
		
		Thread.sleep(5000);
		
		//3.provide username -Admin
		//WebElement txtUsername=driver.findElement(By.name("username"));
		//txtUsername.sendKeys("Admin");
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		
		//4.Provide Password---admin123
		driver.findElement(By.name("password")).sendKeys("admin12");
		
		//5.click on the login button
		driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		Thread.sleep(7000);
		
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
		//driver.quit();
	}

}
