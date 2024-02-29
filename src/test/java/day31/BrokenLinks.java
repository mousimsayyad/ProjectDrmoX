package day31;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class BrokenLinks {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("no of links: "+links.size());
		
		int brokenUrls=0;
		for(WebElement link:links)
		{
			String hrefatt= link.getAttribute("href");
			if(hrefatt==null || hrefatt.isEmpty())
			{
				continue;
			}
			
			URL linkurl = new URL(hrefatt);
			HttpURLConnection conn=(HttpURLConnection)linkurl.openConnection();
			conn.connect();
			
			if(conn.getResponseCode()>=400) {
				System.out.println(hrefatt+"    "+"Broken URL");
				brokenUrls++;
			}
			else
			{
				System.out.println("Not Broken URL");
			}
		}
		System.out.println("No of brokenurls are: "+brokenUrls);
	}

}
