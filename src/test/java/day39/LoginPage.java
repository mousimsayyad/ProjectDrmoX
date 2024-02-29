package day39;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage
{
	public WebDriver driver;
	
	//Constructor
	LoginPage(WebDriver driver)
	{
		this.driver= driver;
	}
	
	
	//locators
	By logo_img_loc = By.xpath("//img[@alt='company-branding']");
	By txt_usrname_loc=By.name("username");
	By txt_paswd_loc = By.name("password");
	By btn_submit_loc=By.xpath("//button[normalize-space()='Login']");
	
	//action methods
	
	public void setUserName(String username)
	{
		driver.findElement(txt_usrname_loc).sendKeys(username);
	}
	
	public void setPassword(String password)
	{
		driver.findElement(txt_paswd_loc).sendKeys(password);
	}
	
	public void clickSubmit()
	{
		driver.findElement(btn_submit_loc).click();
	}
	
	public boolean checkLogoPresence()
	{
		boolean status=driver.findElement(logo_img_loc).isDisplayed();
		return status;
	}
	
	
}
