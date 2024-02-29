package day24;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckboxes {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		//select specific checkbox
		//driver.findElement(By.xpath("//input[@id='monday']")).click();
		
		//total number of checkboxes
		List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		System.out.println("total no of checkboes: "+checkboxes.size());
		
		//select all the checkboxes
		/*for(int i=0;i<checkboxes.size();i++) 
		{
			checkboxes.get(i).click();
		}*/
		
		/*for(WebElement ch:checkboxes) {
			ch.click();
		}*/
		
		//select last 2 checkboxes
		//formula= total no of checkboxes - how many checkbxes selected
		
		/*for(int i=4;i<checkboxes.size();i++)
		{
			checkboxes.get(i).click();
		}*/
		
		//Select first 2 checkboxes
		/*for(int i=0;i<3;i++){
			checkboxes.get(i).click();
		}*/
		
		
		/*for(int i=0;i<checkboxes.size();i++) 
		{
			if(i<2) {
				checkboxes.get(i).click();
			}
			
		}*/
		
		
		//clear/uncheck boxes
		
		for(int i=0;i<3;i++) 
		{
			
			checkboxes.get(i).click();
			
		}
		
		/*for(int i=0;i<checkboxes.size();i++) 
		{
			if(checkboxes.get(i).isSelected()) {
				checkboxes.get(i).click();
			}
			
		}*/
		
		for(WebElement chk:checkboxes) 
		{
			if(chk.isSelected()) {
				chk.click();
			}
		}
		
		
		
	}

}
