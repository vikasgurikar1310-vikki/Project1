package xpath;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathForDynamic {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.xpath("(//input[contains(@title,'Search for')])[1]")).sendKeys("iphone");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//span[@role='button']")).click();
	
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//div[text()='Apple iPhone 16 (Black, 128 GB)']/../..//div[text()='Bank Offer']")).click();
	Set<String> windids = driver.getWindowHandles();
	for(String id : windids)
	{
		driver.switchTo().window(id);
		String url = driver.getCurrentUrl();
		if(url.contains("https://www.flipkart.com/apple-iphone-16-black-128-gb/p"))
		{
			String text = driver.findElement(By.xpath("//h1[text()='APPLE iPhone 16 (Black, 128 GB)']/../../../../../../../../../../../../..//div[text()='₹69,900']")).getText();
			System.out.println(text);
		}
	
	}
}
}
