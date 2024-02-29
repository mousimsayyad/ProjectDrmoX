package day28;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0); //switch to frame
		
		//Approach1
		//driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("10/15/2022");  //mm//dd/yyyy
		
		//Approach2  future date
		/*String day="19";
		String month="December";
		String year="2030";
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click(); //it will open datepicker
		
		//select month & year
		while(true)
		{
			String mn=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String yr=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			
			if(mn.equals(month) && yr.equals(year)) 
			{
				break;
			}
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click(); //next button
		}
		
		List<WebElement> data=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
		for(WebElement dt:data) 
		{
			if(dt.getText().equals(day))
			{
				dt.click();
				break;
			}
		}
		
		for(int i=0;i<data.size();i++) 
		{
			if(data.get(i).getText().equals(day)) 
			{
				data.get(i).click();
				break;
			}
		}*/
		
	//Past date
		String day="19";
		String month="December";
		String year="1991";
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click(); //it will open datepicker
		
		//select month & year
		while(true)
		{
			String mn=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String yr=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			
			if(mn.equals(month) && yr.equals(year)) 
			{
				break;
			}
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click(); //previous button
		}
		
		List<WebElement> data=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
		/*for(WebElement dt:data) 
		{
			if(dt.getText().equals(day))
			{
				dt.click();
				break;
			}
		}*/
		
		for(int i=0;i<data.size();i++) 
		{
			if(data.get(i).getText().equals(day)) 
			{
				data.get(i).click();
				break;
			}
		}
		
		
		

	}

}
