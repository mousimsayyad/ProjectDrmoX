package day22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CoditionalCommands {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		driver.manage().window().maximize();
		
		//logo element isDisplayed()
		//WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		//System.out.println("Display Status of Logo: "+logo.isDisplayed());
		
		//Boolean status=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
		//System.out.println(status);
		
		//isEnabled
		//WebElement searchbox=driver.findElement(By.xpath("//input[@name='q']"));
		//System.out.println(searchbox.isDisplayed());
		//System.out.println(searchbox.isEnabled());
		
		//isSelected
		WebElement male_rd=driver.findElement(By.xpath("//input[@id='gender-male']"));
		WebElement female_rd=driver.findElement(By.xpath("//input[@id='gender-female']"));
		
		//Before Selection
		System.out.println("Before Selection: "+male_rd.isSelected());
		System.out.println("Before Selection: "+female_rd.isSelected());
		
		//After selection of male radio button
		System.out.println("After Selection male radio button:");
		male_rd.click();
		System.out.println("Before Selection: "+male_rd.isSelected());
		System.out.println("Before Selection: "+female_rd.isSelected());
		
		
		//After selection of female radio button
		System.out.println("After Selection female radio button:");
		female_rd.click();
		System.out.println("Before Selection: "+male_rd.isSelected());
		System.out.println("Before Selection: "+female_rd.isSelected());
				
		
	}

}
